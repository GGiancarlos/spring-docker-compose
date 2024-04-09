package com.ggutierrez.docker.model.dto;

import com.ggutierrez.docker.model.entity.Car;

public record CarDto(Long id, String brand, String model, String color, Integer year) {

    public static CarDto from(Car car) {
        return new CarDto(car.getId(), car.getBrand(), car.getModel(), car.getColor(), car.getYear());
    }
}
