package clound.feign;

import clound.hystrix.HystrixTestFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name="spring-cloud-producer",fallback = HystrixTestFeign.class)
public interface TestFeign {

    @RequestMapping(value = "/test")
    @ResponseBody
    String test(@RequestParam(value = "value") String value);
}
