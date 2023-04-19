package com.cdac.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Employee;
import com.cdac.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = { "/employee_add_form.htm" })
	public String employeeAddForm(ModelMap model) {
		model.put("employee", new Employee());
		return "employee_add_form";
	}

	@RequestMapping(value = { "/employee_add.htm" }, method = RequestMethod.POST)
	public String employeeAdd(Employee employee, ModelMap model) {
		employeeService.add(employee);
		model.put("employee", employee);
		return "employee_add_form";
	}

	@RequestMapping(value = { "/employee_list.htm" }, method = RequestMethod.GET)
	public String employeeList(ModelMap model) {
		List<Employee> lst = employeeService.getAll();
		model.put("employees", lst);
		return "employee_list";
	}

	@RequestMapping(value = { "/employee_delete.htm" }, method = RequestMethod.GET)
	public String employeeDelete(@RequestParam(name = "id") int id, ModelMap model) {
		employeeService.removeById(id);
		List<Employee> lst = employeeService.getAll();
		model.put("employees", lst);
		return "employee_list";
	}

	@RequestMapping(value = { "/employee_update_form.htm" }, method = RequestMethod.GET)
	public String employeeUpdateForm(@RequestParam(name = "id") int id, ModelMap model) {
		Employee e = employeeService.getById(id);
		model.put("employee", e);
		return "employee_update_form";
	}

	@RequestMapping(value = { "/employee_update.htm" }, method = RequestMethod.POST)
	public String employeeUpdate(Employee employee, ModelMap model) {
		employeeService.modify(employee);
		List<Employee> lst = employeeService.getAll();
		model.put("employees", lst);
		return "employee_list";
	}

}
