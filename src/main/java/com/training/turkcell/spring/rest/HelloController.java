package com.training.turkcell.spring.rest;

import com.training.turkcell.spring.rest.models.Customer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    @GetMapping("/hello3/{abc}/{xyz}")
    public String helloV3(@PathVariable("abc") String name,
                          @PathVariable("xyz") String surname) {
        return "Hello 3 : " + name + " " + surname;
    }

    @GetMapping("/hello3a/{name}/{surname}")
    public String helloV3a(@PathVariable String name,
                           @PathVariable String surname) {
        return "Hello 3a : " + name + " " + surname;
    }

    @GetMapping("/hello4/{abc}")
    public String helloV4(@PathVariable("abc") String name,
                          @RequestParam("xyz") String surname) {
        return "Hello 4 : " + name + " " + surname;
    }

    @GetMapping("/hello5/{abc}")
    public String helloV5(@PathVariable("abc") String name,
                          @MatrixVariable("xyz") String surname) {
        return "Hello 4 : " + name + " " + surname;
    }

    @PostMapping("/hello6")
    public String helloV6(@RequestBody Customer customerParam) {
        return "Hello 4 : " + customerParam;
    }


}
