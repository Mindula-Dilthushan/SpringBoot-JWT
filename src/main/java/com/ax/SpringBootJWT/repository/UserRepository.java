//Mindula Dilthushan
//Spring Boot JWT Demo Project
package com.ax.SpringBootJWT.repository;

import com.ax.SpringBootJWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
