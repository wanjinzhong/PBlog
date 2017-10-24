package com.potafish.pblog.dao.repository;

import com.potafish.pblog.dao.entity.SystemProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemProfileRepository extends JpaRepository<SystemProfile, Long> {
}
