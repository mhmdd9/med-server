package com.medical.app.service.user;

import com.medical.app.dao.user.ContactInfoRepo;
import com.medical.app.model.user.ContactInfo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ContactInfoService {

    final ContactInfoRepo repo;
    final UserService userService;

    public ContactInfoService(ContactInfoRepo repo, UserService userService) {
        this.repo = repo;
        this.userService = userService;
    }

    public ContactInfo findByUserId(Long userId) {
        return repo.findByUserId(userId);
    }

    @Transactional
    public ContactInfo save(ContactInfo entity) {
        entity.setUser(userService.findById(entity.getId()));
        return this.repo.save(entity);
    }
}
