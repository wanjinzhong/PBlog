package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.Tag;

public interface TagService {
    Tag findById(Long id);
}
