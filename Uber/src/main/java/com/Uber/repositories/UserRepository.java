package com.Uber.repositories;


import com.Uber.models.User;


import java.util.*;

public class UserRepository {
    private Map<String, User> db = new HashMap<>();


    public Optional<User> findUserById(String id) {
        if (db.containsKey(id)) {
            return Optional.of(db.get(id));
        }
        return Optional.empty();
    }

    public void save(User user) {
        db.put(user.getUserId(), user);
    }
}
