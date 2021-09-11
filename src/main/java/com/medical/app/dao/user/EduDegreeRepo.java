package com.medical.app.dao.user;

import com.medical.app.model.user.EduDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduDegreeRepo extends JpaRepository<EduDegree, Long> {
}
