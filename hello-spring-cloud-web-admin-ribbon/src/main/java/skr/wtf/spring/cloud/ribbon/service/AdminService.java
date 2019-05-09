package skr.wtf.spring.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate template;

    public String sayHi(String msg){
        return template.getForObject("http://HELLO-SPRING-CLOUD-SERVIC-ADMIN/hi?message="+msg,String.class);
    }
}
