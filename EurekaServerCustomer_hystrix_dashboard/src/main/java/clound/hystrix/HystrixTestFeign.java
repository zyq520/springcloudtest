package clound.hystrix;

import clound.feign.TestFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhuangyq
 * @create 2018-05-30 下午 15:44
 **/
@Component
public class HystrixTestFeign implements TestFeign {

    @Override
    public String test(@RequestParam(value = "value")String value) {
        return "sorry,get value faild";
    }
}
