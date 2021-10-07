package com.example.tema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1Controller {

    @GetMapping("p1")
    public String method1(HttpServletRequest httpServletRequest) {
        // punctul a
        return "getServletPath: " + httpServletRequest.getRequestURL();
    }
    @GetMapping("p2")
    public String method2(HttpServletRequest httpServletRequest) {
        // punctul b
        return "getServletPath: " + httpServletRequest.getRequestURI();
    }

    @GetMapping("p4")
    public String method4(HttpServletRequest httpServletRequest) {
        // punctul d
        return "getServletPath: " + httpServletRequest.getQueryString();
    }
    @GetMapping("p3")
    // punctul c
    public String method3(HttpServletRequest httpServletRequest) {
        return "URL-ul absolut al cererii HTTP - getRequestURL: " + httpServletRequest.getRequestURL();
    }

    @GetMapping("p5")
    // punctul e
    public String method5(HttpServletRequest httpServletRequest) {
        return "șirul de perechi nume=valoare (en. query string) a cererii HTTP - getQueryString: " + httpServletRequest.getQueryString();
    }
}
