package com.medical.app.dao.user;

import com.medical.app.model.user.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobExperienceRepo extends JpaRepository<JobExperience, Long> {
}
