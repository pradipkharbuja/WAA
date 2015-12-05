package app06b.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import app06b.domain.Employee;
import app06b.exception.InvalidImageUploadException;

@org.springframework.stereotype.Controller
public class EmployeeController {

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
			Model model, HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}

		// save product here

		model.addAttribute("employee", employee);

		// upload a image
		MultipartFile productImage = employee.getImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		if (productImage != null && !productImage.isEmpty()) {
			if (productImage.getContentType().contains("image/")) {
				System.out.println("Image is not null. " + productImage.getContentType());
				try {
					productImage.transferTo(
							new File(rootDirectory + "\\resources\\images\\" + productImage.getOriginalFilename()));
					System.out.println("Image Uploaded");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					throw new RuntimeException("Product Image saving failed", e);
				}
			} else {
				throw new InvalidImageUploadException();
			}
		} else {
			System.out.println("Please select image.");
		}

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
}
