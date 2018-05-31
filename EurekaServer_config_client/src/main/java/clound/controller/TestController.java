package clound.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuangyq
 * @create 2018-05-31 上午 10:06
 **/
@Controller
@RefreshScope
public class TestController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return hello;
    }
}
