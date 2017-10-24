package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.Notify;
import com.potafish.pblog.dao.repository.NotifyRepository;
import com.potafish.pblog.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private NotifyRepository notifyRepository;

    @Override
    public Notify findById(Long id) {
        return notifyRepository.findOne(id);
    }
}
