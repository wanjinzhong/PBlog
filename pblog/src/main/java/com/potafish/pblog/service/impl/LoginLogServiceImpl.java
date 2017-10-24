package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.LoginLog;
import com.potafish.pblog.dao.repository.LoginLogRepository;
import com.potafish.pblog.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogRepository loginLogRepository;

    @Override
    public LoginLog findById(Long id) {
        return loginLogRepository.findOne(id);
    }
}
