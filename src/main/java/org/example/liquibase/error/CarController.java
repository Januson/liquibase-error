package org.example.liquibase.error;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CarController {

    @GetMapping("/cars")
    String get() {
        return "It works!";
    }

}
