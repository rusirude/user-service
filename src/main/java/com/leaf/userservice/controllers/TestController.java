package com.leaf.userservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Rusiru on 07-Jul-18.
 */
@RestController
@RequestMapping("user")
public class TestController {

    @GetMapping("/{name}")
    public String getUsername(@PathVariable("name") final String name){
        return "My name is "+name;
    }
}
