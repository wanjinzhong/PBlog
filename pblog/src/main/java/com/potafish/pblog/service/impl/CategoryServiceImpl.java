package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.Category;
import com.potafish.pblog.dao.repository.CategoryRepository;
import com.potafish.pblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category findById(Long id) {
        return categoryRepository.findOne(id);
    }
}
