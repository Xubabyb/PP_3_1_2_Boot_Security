package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    /*User updateUser(User user);*/

    void removeUserById(Long id);

    void saveUser(User user);


}
