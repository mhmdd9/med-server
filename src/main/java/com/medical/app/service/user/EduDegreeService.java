package com.medical.app.service.user;

import com.medical.app.dao.user.EduDegreeRepo;
import com.medical.app.model.user.EduDegree;
import org.springframework.stereotype.Service;

@Service
public class EduDegreeService {

    final EduDegreeRepo repo;

    public EduDegreeService (EduDegreeRepo repo) {
        this.repo = repo;
    }

    public EduDegree findById(Long id) {
        return this.repo.findById(id).orElse(null);
    }

    public EduDegree save(EduDegree entity) {
        return this.repo.save(entity);
    }
}
