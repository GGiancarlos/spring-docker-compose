package com.ggutierrez.docker.utils;

import com.ggutierrez.docker.model.entity.Car;
import com.ggutierrez.docker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Loading data...");

        carRepository.saveAll(getCarList());

        log.info("Data loaded!");
    }

    private List<Car> getCarList() {
        var car1 = Car.builder()
            .brand("Ford")
            .model("Mustang")
            .color("red")
            .year(1799)
            .build();

        var car2 = Car.builder()
            .brand("Ford")
            .model("Fusion")
            .color("blue")
            .year(2019)
            .build();

        var car3 = Car.builder()
            .brand("Chevrolet")
            .model("Cruze")
            .color("black")
            .year(2019)
            .build();

        return List.of(car1, car2, car3);
    }
}
