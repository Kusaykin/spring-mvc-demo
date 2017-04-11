package com.dinsoft.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by din on 10.04.17.
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    // need a controller method to show the initial HTML form@RequestMapping("/showForm")

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // new a controller method to read from data and add data to tht model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create message to the model
        String result = "Yo! " + theName;
        System.out.println("message: "+result);
        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create message to the model
        String result = "Hey My Friend from v3! " + theName;
        System.out.println("message: "+result);
        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
