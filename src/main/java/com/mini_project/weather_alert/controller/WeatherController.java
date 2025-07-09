package com.mini_project.weather_alert.controller;

import com.mini_project.weather_alert.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast") // 대구 광역시 북구 nx:89 ny:91
    public String getForecast(@RequestParam("nx") String nx, @RequestParam("ny") String ny) {
        return weatherService.getForecast(nx, ny);
    }
}
