package com.webproject.webprojectuni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/regMain")
    public String regMain(Model model) {
        return "regMain";
    }

}
