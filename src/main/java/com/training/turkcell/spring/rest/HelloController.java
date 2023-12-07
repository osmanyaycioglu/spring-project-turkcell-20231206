package com.training.turkcell.spring.rest;

import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {
    // Http method + path
    // /hello/hello1 GET Method
    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }

    // /hello/hello1 POST Method
    @PostMapping("/hello1")
    public String hello2() {
        return "hello2";
    }

    // /hello/hello1 PUT Method
    @PutMapping("/hello1")
    public String hello3() {
        return "hello3";
    }

    // /hello/hello1 PATCH Method
    @PatchMapping("/hello1")
    public String hello4() {
        return "hello4";
    }

    // /hello/hello1 DELETE Method
    @DeleteMapping("/hello1")
    public String hello5() {
        return "hello5";
    }

    @GetMapping("/hello2")
    public String helloWorld(@RequestParam String name,
                             @RequestParam String surname) {
        return "Hello 2 : " + name + " " + surname;
    }

}
