package com.example.tempconverter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.tempconverter.model.TemperatureLog;

@Repository
public interface TemperatureRepository extends MongoRepository<TemperatureLog, String> {

}