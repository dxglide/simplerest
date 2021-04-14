package com.dxglide.tests.simplerest.simplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ApiController {

    @GetMapping(path="/hello", produces = "application/json")
    public String  getHello() {
        return "{ \"answer\" : \"Hello\" }";
    }

}
