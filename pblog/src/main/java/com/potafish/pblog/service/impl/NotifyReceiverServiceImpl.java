package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.NotifyReceiver;
import com.potafish.pblog.dao.repository.NotifyReceiverRepository;
import com.potafish.pblog.service.NotifyReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class NotifyReceiverServiceImpl implements NotifyReceiverService {

    @Autowired
    private NotifyReceiverRepository notifyReceiverRepository;
    @Override
    public NotifyReceiver findById(Long id) {
        return notifyReceiverRepository.findOne(id);
    }
}
