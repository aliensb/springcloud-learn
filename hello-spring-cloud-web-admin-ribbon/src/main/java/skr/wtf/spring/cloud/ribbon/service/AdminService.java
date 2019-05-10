package skr.wtf.spring.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate template;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String msg){
        return template.getForObject("http://HELLO-SPRING-CLOUD-SERVIC-ADMIN/hi?message="+msg,String.class);
    }

    public String hiError(String msg){
        return String.format("hi ,you message is %s,but request bad",msg);
    }
}
