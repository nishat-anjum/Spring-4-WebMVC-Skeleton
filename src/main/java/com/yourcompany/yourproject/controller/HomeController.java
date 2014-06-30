package com.yourcompany.yourproject.controller;

import com.yourcompany.yourproject.model.Student;
import com.yourcompany.yourproject.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String firstPage(ModelMap model) {
        log.debug("at first page");
        model.addAttribute("msg", "Here a greeting message for you forwarded from HomeController ;)");
        return "home";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String showForm(ModelMap modelMap) {
        modelMap.put("student", new Student());
        return "regForm";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute Student student,
                           BindingResult bindingResult, ModelMap modelMap) {
        studentService.saveStudent(student);
        modelMap.addAttribute("success", "New Student Saved Successfully");
        return "home";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAllStudents(ModelMap modelMap) {
        modelMap.put("studentList", studentService.getAllStudents());
        return "home";
    }
}
