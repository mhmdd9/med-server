package com.medical.app.dao.user;

import com.medical.app.model.user.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInfoRepo extends JpaRepository<ContactInfo, Long> {

    @Query("select ci from USER_CONTACT_INFO ci where ci.user.id = :userId")
    ContactInfo findByUserId(@Param("userId") Long userId);
}
