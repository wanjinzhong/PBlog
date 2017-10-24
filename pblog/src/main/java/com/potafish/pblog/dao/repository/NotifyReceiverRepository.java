package com.potafish.pblog.dao.repository;

import com.potafish.pblog.dao.entity.NotifyReceiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyReceiverRepository extends JpaRepository<NotifyReceiver, Long> {
}
