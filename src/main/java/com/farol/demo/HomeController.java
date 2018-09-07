package com.farol.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private UserRepo userRepo;
    @RequestMapping("/")
    public ModelAndView Index()
    {
        return new ModelAndView("Index");
    }
}
