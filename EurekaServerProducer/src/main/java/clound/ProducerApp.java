package clound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhuangyq
 * @create 2018-05-30 下午 14:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApp.class, args);
    }
}
