package com.medical.app.dao.user;

import com.medical.app.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByPhoneNumber(String phoneNumber);
}
