package services;

import entities.User;

public interface UserService {
    User findByUserName(String username);
}
