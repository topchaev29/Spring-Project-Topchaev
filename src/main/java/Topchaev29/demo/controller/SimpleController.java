package Topchaev29.demo.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class SimpleController {

    @GetMapping("/")
    public String index(Model model) {
        model.addText("Привет, мы будем говорить об искусственном интеллекте!");
        return "index";
    }
}
