package net.ashishshah.sendtab

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "net.ashishshah.sendtab" )
public class App implements CommandLineRunner {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(App.class, args)
    }

    @Override
    public void run(String... args) throws Exception {}
}
