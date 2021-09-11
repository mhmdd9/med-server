package com.medical.app.dao.user;

import com.medical.app.model.user.SpecInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecInfoRepo extends JpaRepository<SpecInfo, Long> {

}
