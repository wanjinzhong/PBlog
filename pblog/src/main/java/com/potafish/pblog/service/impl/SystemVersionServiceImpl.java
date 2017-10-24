package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.SystemVersion;
import com.potafish.pblog.dao.repository.SystemVersionRepository;
import com.potafish.pblog.service.SystemVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SystemVersionServiceImpl implements SystemVersionService {

    @Autowired
    private SystemVersionRepository systemVersionRepository;

    @Override
    public SystemVersion findById(Long id) {
        return systemVersionRepository.findOne(id);
    }
}
