package com.example.tempconverter.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tempconverter.model.TemperatureLog;
import com.example.tempconverter.repository.TemperatureRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TemperatureService {

    private final TemperatureRepository temperatureRepository;

    public TemperatureLog convertAndSave(double value, String unit) {

        double result;
        String outputUnit;

        if (unit.equalsIgnoreCase("Celsius")) {
            result = (value * 9 / 5) + 32;
            outputUnit = "Fahrenheit";
        } else {
            result = (value - 32) * 5 / 9;
            outputUnit = "Celsius";
        }

        TemperatureLog log = new TemperatureLog();

        log.setInputTemperature(value);
        log.setInputUnit(unit);
        log.setOutputTemperature(result);
        log.setOutputUnit(outputUnit);
        log.setTimestamp(LocalDateTime.now().toString());

        return temperatureRepository.save(log);
    }

    public List<TemperatureLog> getAllLogs() {
        return temperatureRepository.findAll();
    }
}
