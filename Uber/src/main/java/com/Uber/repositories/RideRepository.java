package com.Uber.repositories;




import com.Uber.models.Ride;

import java.util.*;


public class RideRepository {
    private Map<String, Ride> db = new HashMap<>();


    public Optional<Ride> findDriverById(String id) {
        if (db.containsKey(id)) {
            return Optional.of(db.get(id));
        }
        return Optional.empty();
    }

    public void save(Ride ride) {
        db.put(ride.getRideId(), ride);
    }

}
