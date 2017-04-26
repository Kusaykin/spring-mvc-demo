package com.dinsoft.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private ImplTest test;

    @RequestMapping("/tests")
    public String showPage() {

        //ImplTest test = new ImplTest();
        test.sayQute();

        return "tests-form";
    }
}
