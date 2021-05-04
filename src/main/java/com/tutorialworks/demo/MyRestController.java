package com.tutorialworks.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${favourite.cheese}")
    String favouriteCheese;

    @GetMapping("/cheese")
    public String getFavouriteCheese() {
        return "My favourite cheese is: " + favouriteCheese;
    }

}
