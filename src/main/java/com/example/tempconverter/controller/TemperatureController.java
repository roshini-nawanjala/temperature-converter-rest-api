package com.example.tempconverter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tempconverter.model.TemperatureLog;
import com.example.tempconverter.service.TemperatureService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/temperatures")
@RequiredArgsConstructor
public class TemperatureController {

    private final TemperatureService temperatureService;

    @PostMapping("/convert")
    public TemperatureLog convertTemperature(
            @RequestParam double value,
            @RequestParam String unit) {

        return temperatureService.convertAndSave(value, unit);
    }

    @GetMapping("/history")
    public List<TemperatureLog> getAllLogs() {
        return temperatureService.getAllLogs();
    }
}