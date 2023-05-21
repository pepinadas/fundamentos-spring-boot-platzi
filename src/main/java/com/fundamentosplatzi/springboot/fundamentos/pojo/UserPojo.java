package com.fundamentosplatzi.springboot.fundamentos.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConstructorBinding;

//@ConstructorBinding
@ConfigurationProperties(prefix = "user")
@AllArgsConstructor
@Getter
@Setter
public class UserPojo {
    private String email;
    private String password;
    private int age;
}
