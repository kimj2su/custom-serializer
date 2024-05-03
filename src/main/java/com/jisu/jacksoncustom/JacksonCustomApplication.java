package com.jisu.jacksoncustom;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JacksonCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacksonCustomApplication.class, args);
    }

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        System.out.println("user = " + user);
        return user;
    }

    @PostMapping("/users2")
    public String createUser2(@RequestBody User user) throws JsonProcessingException {
        String s = objectMapper.writeValueAsString(user);
        System.out.println("s = " + s);
        return s;
    }
}
