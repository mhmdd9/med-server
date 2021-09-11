package com.medical.app.service.user;

import com.medical.app.dao.user.SpecInfoRepo;
import com.medical.app.model.user.SpecInfo;
import org.springframework.stereotype.Service;

@Service
public class SpecInfoService {

    final SpecInfoRepo repo;

    public SpecInfoService (SpecInfoRepo repo) {
        this.repo = repo;
    }

    public SpecInfo findById(Long userId) {
        return this.repo.findById(userId).orElse(null);
    }

    public SpecInfo save(SpecInfo entity) {
        return this.repo.save(entity);
    }
}
