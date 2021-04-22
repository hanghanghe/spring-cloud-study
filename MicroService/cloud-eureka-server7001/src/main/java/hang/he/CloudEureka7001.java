package hang.he;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//表示为eureka的服务注册中心
public class CloudEureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEureka7001.class,args);
    }
}
