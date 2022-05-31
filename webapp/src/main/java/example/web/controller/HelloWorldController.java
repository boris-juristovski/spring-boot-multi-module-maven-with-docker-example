package example.web.controller;

import example.base.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldService someService;

    public HelloWorldController(HelloWorldService someService) {
        this.someService = someService;
    }

    @GetMapping("/hello")
    public String home() {
        return someService.helloWorld();
    }
}
