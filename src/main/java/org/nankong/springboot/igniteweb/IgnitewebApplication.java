package org.nankong.springboot.igniteweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.nankong.springboot.igniteweb"})
public class IgnitewebApplication {

    public static void main(String[] args) {
        SpringApplication.run(IgnitewebApplication.class, args);
    }
}
