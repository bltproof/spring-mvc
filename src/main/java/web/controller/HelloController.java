package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping(value = "/hello")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/calculator")
    public String action(ModelMap model,
                         @RequestParam("a") Integer a,
                         @RequestParam("b") Integer b,
                         @RequestParam("action") String action) {
        double result = 0;

        switch (action) {
            case ("multiplication"):
                result = a * b;
                break;
            case ("addition"):
                result = a + b;
                break;
            case ("substraction"):
                result = a - b;
                break;
            case ("division"):
                result = a / b;
        }

        model.addAttribute("result", result);
        return "index";
    }
}