package com.yiibai.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public ModelAndView student() {
		Student student = new Student();
		System.out.println(student);
		return new ModelAndView("addStudent", "command", student);
	}

	@ModelAttribute("student")
	public Student createStudentModel() {
		Student student = new Student();
		System.out.println(student);
		return student;
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") @Validated Student student, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "addStudent";
		}
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
}