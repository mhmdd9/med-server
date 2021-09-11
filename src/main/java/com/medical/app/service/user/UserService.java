package com.medical.app.service.user;

import com.medical.app.dao.user.UserRepo;
import com.medical.app.model.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public User findByPhoneNumber(String phoneNumber) {
        return repo.findByPhoneNumber(phoneNumber);
    }

    public User findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User save(User user) {
        return this.repo.save(user);
    }

}
