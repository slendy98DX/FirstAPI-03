package it.develhope.FirstAPI03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String getConcatenation(@RequestParam String name, @RequestParam(required = false) String surname){
        if(surname == null){
            return name;
        } else {
            return name+" "+surname;
        }
    }
}
