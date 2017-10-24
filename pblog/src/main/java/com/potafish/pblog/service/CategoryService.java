package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.Category;

public interface CategoryService {

    Category findById(Long id);
}
