package cn.minmuslin.AtlasY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AtlasYApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtlasYApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}