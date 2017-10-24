package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.User;

public interface UserService {
    User findById(Long id);
}
