package com.perfect_imitation.bamin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class})
@RestController
public class BaminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaminApplication.class, args);
    }
    @GetMapping(path = "/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

}
