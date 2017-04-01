package me.yogendra.cachedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCaching
@RestController
@Slf4j
public class FrontendApplication {
    @Autowired
    private ApiClient client;

    public static void main(String[] args) {
        SpringApplication.run(FrontendApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return client.index();
    }
}
