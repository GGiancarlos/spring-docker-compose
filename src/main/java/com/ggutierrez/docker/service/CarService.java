package com.ggutierrez.docker.service;

import com.ggutierrez.docker.model.dto.CarDto;
import com.ggutierrez.docker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<CarDto> getAll() {
        return carRepository.findAll()
            .stream()
            .map(CarDto::from)
            .toList();
    }

}
