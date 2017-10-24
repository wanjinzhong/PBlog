package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.Tag;
import com.potafish.pblog.dao.repository.TagRepository;
import com.potafish.pblog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag findById(Long id) {
        return tagRepository.findOne(id);
    }
}
