package skr.wtf.spring.cloud.feign.feign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import skr.wtf.spring.cloud.feign.feign.service.hystrix.AdminServiceHystrix;

@FeignClient(value = "HELLO-SPRING-CLOUD-SERVIC-ADMIN",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
