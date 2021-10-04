package com.example.tema.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Ex2Cookies {
    @GetMapping("2a")
    // punctul a
    public Cookie[] method1(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getCookies();
    }

    @GetMapping("2b")
    // punctul b
    public String method2(HttpServletRequest httpServletRequest) {
        return "lista de antete cerere - getHeader  "+httpServletRequest.getHeader("headers");
    }

    @GetMapping("2c")
    // punctul c
    public String method3(HttpServletRequest httpServletRequest) {
        return "lista de parametri din query string - getHeaderNames()  "+httpServletRequest.getHeaderNames().toString();
    }
}
