package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.Subscription;
import com.potafish.pblog.dao.repository.SubscriptionRepository;
import com.potafish.pblog.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription findById(Long id) {
        return subscriptionRepository.findOne(id);
    }
}
