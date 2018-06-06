package clound.controller;

import clound.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TestFeign testFeign;

    @RequestMapping("/test1")
    @ResponseBody
    public String test(String value){
        return testFeign.test(value);
    }
}
