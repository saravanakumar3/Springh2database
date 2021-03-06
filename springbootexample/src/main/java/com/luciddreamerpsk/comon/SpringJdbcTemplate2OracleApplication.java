package com.luciddreamerpsk.comon;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
 
@SpringBootApplication
public class SpringJdbcTemplate2OracleApplication implements CommandLineRunner {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
     
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcTemplate2OracleApplication.class, args);
    }
 
   
    public void run(String... args) throws Exception {
        System.out.println("Reading movie records...");
        System.out.printf("%-30.30s  %-30.30s%n", "Title", "Description");
        jdbcTemplate.query("SELECT * FROM users", (rs)-> {
            System.out.printf("%-30.30s  %-30.30s%n", rs.getString("title"), rs.getString("description"));         
        });
 
}}