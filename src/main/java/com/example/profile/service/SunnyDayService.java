package com.example.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"sunny", "default"})
public class SunnyDayService implements WeatherService{

    @Override
    public String forecast(String date) {
        return "Today is sunny day" + date;
    }
}
