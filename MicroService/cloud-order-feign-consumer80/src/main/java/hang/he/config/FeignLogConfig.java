package hang.he.config;


import feign.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLogConfig {
    Logger.Level feignLogLevel(){
        return  Logger.Level.FULL;
    }
}
