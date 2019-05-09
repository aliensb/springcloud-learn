package skr.wtf.spring.cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }
}