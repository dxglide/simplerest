package com.dxglide.tests.simplerest.simplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "/")
public class ApiController {
    @GetMapping(path="/", produces = "application/json")
    public String  getHello() {
        return "{ \"answer\" : \"Hello\" }";
    }


    @GetMapping(path="/mano_testas_kitu_linku_tas_pas", produces = "application/json")
    public String  getHello2() {
        return "{ \"answer\" : \"Hello 2 kitu linku\" }";
    }


}
