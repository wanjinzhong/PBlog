package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.SystemVersion;

public interface SystemVersionService {

    SystemVersion findById(Long id);
}
