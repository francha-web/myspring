package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @GetMapping({"/", "/myspring"})
    public String hello(HttpServletRequest request) {
        return "hello";
    }
}