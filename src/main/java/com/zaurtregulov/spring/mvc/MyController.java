package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class MyController {

    @RequestMapping(value = "/hello")
    public String showFirstView() {
        return "ff";
    }
}
