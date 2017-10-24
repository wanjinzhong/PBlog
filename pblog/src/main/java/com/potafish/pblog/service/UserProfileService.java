package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.UserProfile;

public interface UserProfileService {

    UserProfile findById(Long id);
}
