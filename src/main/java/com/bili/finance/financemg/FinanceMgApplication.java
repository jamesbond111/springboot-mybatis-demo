package com.bili.finance.financemg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.bili.finance.financemg.mapper")
public class FinanceMgApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceMgApplication.class, args);
    }

}
