package com.potafish.pblog.dao.repository;

import com.potafish.pblog.dao.entity.SystemVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemVersionRepository extends JpaRepository<SystemVersion, Long> {
}
