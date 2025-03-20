package com.web_app.sample_web_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String sayHello() {
        return "Welcome back customer";
    }

    @GetMapping("/about")
    public String getAboutData() {
        return "Welcome from about page";
    }

}
