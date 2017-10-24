package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.SystemProfile;
import com.potafish.pblog.dao.repository.SystemProfileRepository;
import com.potafish.pblog.service.SystemProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SystemProfileServiceImpl implements SystemProfileService {

    @Autowired
    private SystemProfileRepository systemProfileRepository;

    @Override
    public SystemProfile findById(Long id) {
        return systemProfileRepository.findOne(id);
    }
}
