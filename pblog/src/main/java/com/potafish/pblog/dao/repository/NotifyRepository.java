package com.potafish.pblog.dao.repository;

import com.potafish.pblog.dao.entity.Notify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyRepository extends JpaRepository<Notify, Long> {
}
