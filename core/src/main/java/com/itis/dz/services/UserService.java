package com.itis.dz.services;

import com.itis.dz.entities.User;
import com.itis.dz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Регина on 08.10.2016.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }

    public boolean checkUser(String mail) {
        User user = userRepository.getUserByLogin(mail);
        if (user == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addUser(String name, String mail, String hash_pass) {
        userRepository.addUser(name,mail,hash_pass);
    }
}
