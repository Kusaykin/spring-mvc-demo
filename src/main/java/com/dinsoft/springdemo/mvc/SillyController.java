package com.dinsoft.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by din on 10.04.17.
 */
@Controller
public class SillyController {
    @RequestMapping("/showForm")
    public String displayTheForm() {
        return "silly";
    }

}
