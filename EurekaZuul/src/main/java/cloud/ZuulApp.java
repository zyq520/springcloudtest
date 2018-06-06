package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhuangyq
 * @create 2018-06-06 上午 10:51
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class, args);
    }
}
