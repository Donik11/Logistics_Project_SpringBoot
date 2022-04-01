package com.trans.abuziyo.service;

import com.trans.abuziyo.domain.Drivers;
import com.trans.abuziyo.repository.DriversRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriversService {

    private final DriversRepository driversRepository;

    public DriversService(DriversRepository driversRepository) {
        this.driversRepository = driversRepository;
    }

    public Drivers save(Drivers drivers) {
        return driversRepository.save(drivers);
    }

    public List<Drivers> findAll(){
        return driversRepository.findAll();
    }
    public Drivers findById(Long id){
        return driversRepository.findById(id).get();
    }
    public List<Drivers> findByCarNumber(String carNumber){
        return driversRepository.findByCarNumber(carNumber);
    }
    public List<Drivers> findByTirNumber(String tirNumber){
        return driversRepository.findByTirNumber(tirNumber);
    }
    public List<Drivers> findByChecker(int checker){
        return driversRepository.findByChecker(checker);
    }

}