package Topchaev29.demo.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public class SimpleController {

    @GetMapping("/")
    public String index(Map<String , Object> model) {
        model.put("key1", "Искусственный");
        model.put("key2", "интеллект");
        model.put("key3", "это");
        model.put("key4", " - круто!");
        return "index";
    }
}
