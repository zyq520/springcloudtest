package clound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuangyq
 * @create 2018-05-30 下午 14:48
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(String value){
        return "first return value:"+value;
    }
}
