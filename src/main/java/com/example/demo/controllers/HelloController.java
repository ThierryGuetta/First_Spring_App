package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spring")
public class HelloController {

    @GetMapping("/hello")
    public String getHelloWorld(@RequestParam(value = "first_name", required = false) String first_name,
                                @RequestParam(value = "last_name", required = false) String last_name,
                                @RequestParam(value = "father_name", required = false) String father_name,
                                Model model) {

        System.out.println("Ваше ФИО: ");
        System.out.println("Имя: " + first_name);
        System.out.println("Фамилия: " + last_name);
        System.out.println("Отчество: " + father_name);

        model.addAttribute("first_name", first_name);
        model.addAttribute("last_name", last_name);
        model.addAttribute("father_name", father_name);

        return "hello";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "message";
    }
}