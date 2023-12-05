package com.example.learning_management_system.repository.user;

import com.example.learning_management_system.exception.UserNotFoundException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepositoryImpl implements UserRepository{

    private final Map<Long, String> users = new ConcurrentHashMap<>() {{
        put(12345L, "Ivanov Ivan");
        put(123456L, "Utkib Sergei");
        put(54321L, "Jdaniv Aleksandr");
        put(5349L, "Valentain Vova");
        put(1111L, "Svallow Semen");
    }};

    @Override
    public String getUserFullname(Long msisdn) throws UserNotFoundException {
        //todo Нужно продумать кейс отсутсвия пользователя по переданному msisdn и где это будет обрабатываться
        String fullName = users.get(msisdn);
        if (fullName != null) {
            return fullName;
        } else {
            throw new UserNotFoundException();
        }
    }
}
