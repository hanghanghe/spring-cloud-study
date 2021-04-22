package hang.he;


import hang.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "cloud-payment-service",configuration = MyselfRule.class)
public class CloudConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer80.class,args);
    }
}
