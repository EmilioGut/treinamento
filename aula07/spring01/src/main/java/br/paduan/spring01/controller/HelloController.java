package br.paduan.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
    
    @GetMapping("/hello")
    public String getOla() {
        return "Olá mundo!";
    }

    @PostMapping("/hello")
    public String getOla2() {
        return "Olá mundo 2!";
    }

}
