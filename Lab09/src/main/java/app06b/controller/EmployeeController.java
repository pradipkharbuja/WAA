package app06b.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

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

@org.springframework.stereotype.Controller
public class EmployeeController {

	private static final Log logger = LogFactory
			.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee,
			BindingResult bindingResult, Model model, HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException(
					"Attempt to bind fields that haven't been allowed in initBinder(): "
							+ StringUtils.addStringToArray(suppressedFields,
									", "));
		}

		// save product here

		model.addAttribute("employee", employee);

		// upload a image
		MultipartFile productImage = employee.getImage();
		String rootDirectory = request.getSession().getServletContext()
				.getRealPath("/");
		if (productImage != null && !productImage.isEmpty()) {
			System.out.println("Image is not null.");
			try {
				productImage.transferTo(new File(rootDirectory
						+ "\\resources\\images\\" + employee.getId() + ".png"));
				System.out.println("Image Uploaded");				
			} catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
			}
		} else {
			System.out.println("Image is null");
		}

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
}
