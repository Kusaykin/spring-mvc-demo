package com.dinsoft.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by din on 07.04.17.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }
}
