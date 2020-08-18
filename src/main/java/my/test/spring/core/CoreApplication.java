package my.test.spring.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CoreApplication.class);
        //springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
        //SpringApplication.run(CoreApplication.class, args);
    }

/*    @Bean
    public CommandLineRunner runCommand() {
        return new CommandClass();
    }*/



}
