package com.trans.abuziyo.repository;

import com.trans.abuziyo.domain.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriversRepository extends JpaRepository<Drivers, Long> {

    List<Drivers> findByTirNumber(String tirNumber);
    List<Drivers> findByCarNumber(String carNumber);
    List<Drivers> findByChecker(int checker);
}
