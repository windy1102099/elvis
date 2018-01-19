package com.example.ssmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
//在类上声明MapperScan，这是mybatis-spring-boot-starter在1.1.1引入的类Mapper，从而在mapper接口上不需要任何声明
@MapperScan("com.example.ssmdemo.mapper")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
public class SsmdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmdemoApplication.class, args);
	}
}
