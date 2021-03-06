package skr.wtf.spring.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import skr.wtf.spring.cloud.feign.feign.service.AdminService;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @GetMapping("hi")
    public String sayHi(String msg){
        return adminService.sayHi(msg);
    }
}
