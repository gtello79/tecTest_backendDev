package com.example.tectestbackenddev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
class TectestbackenddevApplicationTests {

    @GetMapping
    public String getEmployers() {
        return "HAOSHAODHSAD";
    }

}
