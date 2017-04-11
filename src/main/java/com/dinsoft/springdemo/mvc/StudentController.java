package com.dinsoft.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by din on 10.04.17.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // create a student object
        Student student = new Student();

        // add student object to the model
        model.addAttribute("student", student);

        // add the country options to the model
        model.addAttribute("theCountryOptions", countryOptions);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        // log the input data
        System.out.println("student:" + student.getFirstName()
                + " " + student.getLastname());
        return "student-confirmation";
    }

}

