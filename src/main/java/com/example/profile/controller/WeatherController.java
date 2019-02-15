package com.example.profile.controller;

import com.example.profile.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    //locakhost/hello dan parametre almayi bekler snra printservice calssak properties componente gore ger dncek
    //locakhost/hello/mstafa yznca ckti ona gore olcak
    //asd
    @RequestMapping(path = "hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name){
        return weatherService.forecast(name);
    }
}
