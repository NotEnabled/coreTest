package my.test.spring.core;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandClass implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("fdsa:"+ args[0]);


    }
}
