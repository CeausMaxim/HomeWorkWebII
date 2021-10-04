package com.example.tema.controller;

import com.example.tema.mathOperation.Add;
import com.example.tema.mathOperation.Concat;
import com.example.tema.mathOperation.op;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/Ex3")
public class Ex3MathStrOperation {

    @PostMapping("/Add")
    // punctul a
    public Integer Add(@RequestBody Add number){
        return number.num1 + number.num2;
    }

    @PostMapping("/Concat")
    // punctul b
    public String Concat(@RequestBody Concat concat){
        return concat.str1 + concat.str2;
    }

    @PostMapping("/op")
    // punctul d
    public Integer op(@RequestBody op number){
        int res = 0;
        switch (number.mathOperation){
            case "-":
                res = number.num1 - number.num2;
                break;
            case "+":
                res = number.num1 + number.num2;
                break;
            case "*":
                res = number.num1 * number.num2;
                break;
            case "/":
                res = number.num1 / number.num2;
                break;
        }
        return res;
    }

    @GetMapping
    public String[] ConcGet(HttpServletRequest request) {
        return request.getRequestURI().split("/");
    }
}
