package com.Uber.repositories;


import com.Uber.models.Driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DriverRepository {
    private Map<String, Driver> db = new HashMap<>();


    public Optional<Driver> findDriverById(String id) {
        if (db.containsKey(id)) {
            return Optional.of(db.get(id));
        }
        return Optional.empty();
    }

    public void save(Driver driver) {
        db.put(driver.getDriverId(), driver);
    }
}
