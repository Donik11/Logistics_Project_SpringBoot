package com.trans.abuziyo.web.rest;

import com.trans.abuziyo.domain.Drivers;
import com.trans.abuziyo.service.DriversService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class DriversResource {

    private final DriversService driversService;

    public DriversResource(DriversService driversService) {
        this.driversService = driversService;
    }
    @PostMapping("")
    public ResponseEntity create(@RequestBody Drivers drivers) {
        Drivers drivers1 = driversService.save(drivers);
        return ResponseEntity.ok(drivers1);
    }
    @PutMapping("")
    public ResponseEntity update(@RequestBody Drivers drivers) {
        Drivers drivers1 = driversService.save(drivers);
        return ResponseEntity.ok(drivers1);
    }
    @GetMapping("")
    public ResponseEntity getAll() {
        List<Drivers> driversList = driversService.findAll();
        return ResponseEntity.ok(driversList);
    }
    @GetMapping("/tir/{tirNumber}")
    public ResponseEntity getTir(@PathVariable String tirNumber) {
        List<Drivers> driversList = driversService.findByTirNumber(tirNumber);
        return ResponseEntity.ok(driversList);
    }
    @GetMapping("/car/{carNumber}")
    public ResponseEntity getCar(@PathVariable String carNumber) {
        List<Drivers> driversList = driversService.findByCarNumber(carNumber);
        return ResponseEntity.ok(driversList);
    }
    @GetMapping("/checker/{checker}")
    public ResponseEntity getChecker(@PathVariable int checker) {
        List<Drivers> driversList = driversService.findByChecker(checker);
        return ResponseEntity.ok(driversList);
    }
}