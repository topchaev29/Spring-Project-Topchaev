package Topchaev29.demo.controller;

import Topchaev29.demo.models.Post;
import Topchaev29.demo.repository.PostRepository;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;
    @GetMapping("/blog")
    public String blogmain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addSubModel("posts", posts);
        return "blog-main";
    }
}
