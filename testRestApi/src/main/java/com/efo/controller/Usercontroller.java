package com.efo.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestController
public class Usercontroller {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user()
    {
        return "dongyc"+ new Date();
    }
}
