package skr.wtf.spring.cloud.feign.feign.service.hystrix;

import org.springframework.stereotype.Component;
import skr.wtf.spring.cloud.feign.feign.service.AdminService;
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("hi ,you message is %s,but request bad",message);
    }
}
