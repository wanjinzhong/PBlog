package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.LoginLog;

public interface LoginLogService {

    LoginLog findById(Long id);
}
