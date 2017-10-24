package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.UserProfile;
import com.potafish.pblog.dao.repository.UserProfileRepository;
import com.potafish.pblog.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;
    @Override
    public UserProfile findById(Long id) {
        return userProfileRepository.findOne(id);
    }
}
