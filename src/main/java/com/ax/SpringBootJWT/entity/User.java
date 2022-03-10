//Mindula Dilthushan
//Spring Boot JWT Demo Project
package com.ax.SpringBootJWT.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    private int userId;
    private String userName;
    private String userPassword;
    private String userEmail;

}
