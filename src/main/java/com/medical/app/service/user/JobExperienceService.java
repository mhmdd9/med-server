package com.medical.app.service.user;

import com.medical.app.dao.user.JobExperienceRepo;
import com.medical.app.model.user.JobExperience;
import org.springframework.stereotype.Service;

@Service
public class JobExperienceService {

    final JobExperienceRepo repo;

    public JobExperienceService (JobExperienceRepo repo) {
        this.repo = repo;
    }

    public JobExperience findById(Long id) {
        return this.repo.findById(id).orElse(null);
    }

    public JobExperience save(JobExperience entity) {
        return this.repo.save(entity);
    }
}
