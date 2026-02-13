package com.listspl.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    @GetMapping("/home")
    public String endpoint(){
        return "LIST Software PVT. Ltd.";
    }
}
