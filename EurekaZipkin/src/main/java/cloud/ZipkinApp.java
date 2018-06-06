package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author zhuangyq
 * @create 2018-06-06 下午 13:48
 **/
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApp {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApp.class, args);
    }
}
