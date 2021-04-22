package hang.he;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
public class FeignHystrixConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixConsumer80.class,args);
    }
}
