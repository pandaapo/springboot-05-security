package com.panda.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、引入spring security模块
 * 2、编写spring security的配置类 （官网，Geting Start）
 *      MySecurityConfig extends WebSecurityConfigurerAdapter
 * 3、控制请求的访问权限
 */
@SpringBootApplication
public class Springboot05SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05SecurityApplication.class, args);
    }
}
