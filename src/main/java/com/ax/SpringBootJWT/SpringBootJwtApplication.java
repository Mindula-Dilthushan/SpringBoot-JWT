//Mindula Dilthushan
//Spring Boot JWT Demo Project
package com.ax.SpringBootJWT;

import com.ax.SpringBootJWT.entity.User;
import com.ax.SpringBootJWT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootJwtApplication {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUser() {
        List<User> users = Stream.of(
                new User(1, "Mindula", "mindula1", "mindula1@gmal.com"),
                new User(2, "Dilthushan", "dilthushan1", "dilthushan1@gmal.com"),
                new User(3, "Manamperi", "manamperi1", "manamperi1@gmal.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtApplication.class, args);
    }
}
