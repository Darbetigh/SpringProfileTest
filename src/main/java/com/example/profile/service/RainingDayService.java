package com.example.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("raining")
public class RainingDayService implements WeatherService{

    @Override
    public String forecast(String date) {
        return "Today is rainning day" + date;
    }
}
