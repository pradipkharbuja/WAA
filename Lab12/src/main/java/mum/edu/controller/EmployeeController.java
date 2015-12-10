package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mum.edu.domain.Employee;
import mum.edu.service.EmployeeService;

//import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping({ "/employees" })
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping({ "/list", "" })
	public String listEmployees(Model model) {
		Iterable<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}

	@RequestMapping("/employee")
	public String getEmployeeByNumber(Model model, @RequestParam("id") int employeeId) {
		Employee employee = employeeService.getEmployeeByNumber(employeeId);
		model.addAttribute("employee", employee);
		return "employee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
		return "addEmployee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@Valid @ModelAttribute("newEmployee") Employee employeeToBeAdded,
			BindingResult result) {
		if (result.hasErrors()) {
			return "addEmployee";
		} else {
			employeeService.addNewEmployee(employeeToBeAdded);
			return "redirect:/employees";
		}
	}

}
