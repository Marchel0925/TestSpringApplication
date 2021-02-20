package com.test.ex5_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("${sda.redirect.name}")
    public String getName(){
        return "Marcis A.";
    }
}
