package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.Subscription;

public interface SubscriptionService {

    Subscription findById(Long id);
}
