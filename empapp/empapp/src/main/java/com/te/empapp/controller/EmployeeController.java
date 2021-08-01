package com.te.empapp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.empapp.dto.EmployeeInfo;
import com.te.empapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	// to convert util date to sql date

	@InitBinder
	public void initConfig(WebDataBinder binder) {
		System.out.println("Inside init");
		CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, customDateEditor);
	}

	@GetMapping("/login")
	public String getLoginForm() {

		return "empHomePage";
	}

	@PostMapping("/login")
	public String authenticate(ModelMap map, int empId, String empPwd, HttpServletRequest request) {

		EmployeeInfo employeeInfo = service.authenticate(empId, empPwd);

		if (employeeInfo != null) {
// creating the session
			HttpSession session = request.getSession();
//setting the session to the employeeInfo object	
			session.setAttribute("loggedIn", employeeInfo);
//			session.setMaxInactiveInterval(10);

			map.addAttribute("name", employeeInfo.getName());
			return "empLogin";
		} else {
			map.addAttribute("errMsg", "Invalid Credentials");
			return "empHomePage";
		}

	}

	@GetMapping("/searchForm")
	public String getSearchForm(@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info,
			ModelMap map) {

		if (info != null) {

			// valid session
			return "searchPage";
		} else {
			// invalid session
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}

	}

	@PostMapping("/search")
	public String getData(ModelMap map, int id,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info) {

		if (info != null) {
//valid session
			EmployeeInfo employeeInfo = service.getData(id);

			if (employeeInfo != null) {

				map.addAttribute("info", employeeInfo);

			} else {
				map.addAttribute("errMsg", "No data found for Id " + id);

			}
			return "searchPage";
		} else {

			// invalid session
			map.addAttribute("errMsg", "Please login first");

			return "empHomePage";
		}

	}

	@GetMapping("/logout")
	public String invalidate(ModelMap map, HttpSession session) {

		session.invalidate();
		map.addAttribute("errMsg", "Logged out successfully");

		return "empHomePage";
	}

	@GetMapping("/deleteForm")
	public String getDeleteForm(@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info,
			ModelMap map) {

		if (info != null) {

			// valid session
			return "deletePage";
		} else {
			// invalid session
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}
	}

	@PostMapping("/delete")
	public String deleteData(ModelMap map, int empId,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info) {

		if (info != null) {

			if (service.deleteData(empId)) {

				map.addAttribute("msg", "Data successfully deleted");

			} else {
				map.addAttribute("errMsg", "Data not found");
			}
			return "deletePage";

		} else {
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}

	}

	@GetMapping("/addForm")
	public String getAddForm(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info) {

		if (info != null) {

			// valid session
			return "addPage";
		} else {
			// invalid session
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}
	}

	@PostMapping("/add")
	public String addData(@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info, ModelMap map,
			EmployeeInfo employeeInfo) {

		if (info != null) {

			if (service.addData(employeeInfo)) {

				map.addAttribute("msg", "Data successfully inserted");

			} else {
				map.addAttribute("errMsg", "Please check the data");
			}
			return "addPage";

		} else {
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}
	}

	@GetMapping("/updateForm")
	public String getUpdateForm(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info) {

		if (info != null) {
			map.addAttribute("id", info.getId());
			map.addAttribute("user", info);
			// valid session
			return "updatePage";
		} else {
			// invalid session
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}
	}

	@PostMapping("/update")
	public String updateData(@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info, ModelMap map,
			EmployeeInfo employeeInfo) {

		if (info != null) {

			System.out.println(employeeInfo);
			if (service.updateData(employeeInfo)) {
				map.addAttribute("msg", "Data successfully updated");

			} else {
				map.addAttribute("msg", "Failed to update");

			}
			map.addAttribute("id", employeeInfo.getId());
			return "updatePage";

		} else {
			map.addAttribute("errMsg", "Please login first");
			return "empHomePage";
		}
	}

	@GetMapping("/seeAll")
	public String getAllRecords(@SessionAttribute(name = "loggedIn", required = false) EmployeeInfo info,
			ModelMap map) {

		if (info != null) {
		List<EmployeeInfo>	infos =  service.getAllEmployees();
		if (infos != null) {
			
			map.addAttribute("infos", infos);
		}else {
			map.addAttribute("errMsg", "No records found");
		}
		return "empLogin";
		
		}else {
			map.addAttribute("errMsg", "Please login first");
			
			return "empHomePage";
		}
		
		
	}

}
