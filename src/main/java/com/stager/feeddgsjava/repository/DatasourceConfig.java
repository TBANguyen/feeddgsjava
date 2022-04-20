package com.stager.feeddgsjava.repository;


import com.github.javafaker.Faker;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.mysql")
//    public DataSource dataSource(){
//        return DataSourceBuilder.create().build();
//    }

    @Bean
    public Faker faker() {return new Faker();}

//    @Bean
//    public DataSource getDataSource(){
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
//        dataSourceBuilder.url("jdbc:mysql://localhost:3307/stager");
//        dataSourceBuilder.username("stager");
//        dataSourceBuilder.password("stager");
//        return dataSourceBuilder.build();
//    }

}
