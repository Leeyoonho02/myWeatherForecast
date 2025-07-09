package com.mini_project.weather_alert.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class WeatherService {

    @Value("${Cc0uBvgBRQeNLgb4ARUHQw}")
    private String apiKey;

    @Value("${kma.api.url}")
    private String apiUrl;

    public String getForecast(String nx, String ny) {
        RestTemplate restTemplate = new RestTemplate();

        LocalDateTime now = LocalDateTime.now();
        String baseDate = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String baseTime = getBaseTime(now);

        URI uri = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("serviceKey", apiKey)
                .queryParam("pageNo", "1")
                .queryParam("numOfRows", "10")
                .queryParam("dataType", "JSON")
                .queryParam("base_date", baseDate)
                .queryParam("base_time", baseTime)
                .queryParam("nx", nx)
                .queryParam("ny", ny)
                .build(true)
                .toUri();

        return restTemplate.getForObject(uri, String.class);
    }

    private String getBaseTime(LocalDateTime now) {
        int hour = now.getHour();
        int minute = now.getMinute();

        if (minute < 45) {
            hour = hour - 1;
        }

        if (hour < 0) {
            hour = 23;
        }

        return String.format("%02d00", hour);
    }
}
