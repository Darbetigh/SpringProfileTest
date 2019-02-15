package com.example.profile;

import com.example.profile.service.WeatherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication implements CommandLineRunner {

    private WeatherService weatherService;

    public static void main(String[] args) {

        SpringApplication.run(ProfileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println(weatherService.forecast("today"));
    }
}


/**
 * URL : localhost:8080/hello/anyString
 * #default profile, sunny day!
 * $ java -jar target/spring-boot-profile-1.0.jar
 * Today is sunny day!
 *
 * # set a profile
 * $ java -jar -Dspring.profiles.active=raining target/spring-boot-profile-1.0.jar
 * Today is raining day!
 */

