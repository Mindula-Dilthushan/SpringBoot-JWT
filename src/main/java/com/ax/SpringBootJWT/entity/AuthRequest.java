//Mindula Dilthushan
//Spring Boot JWT Demo Project
package com.ax.SpringBootJWT.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String userName;
    private String userPassword;
}
