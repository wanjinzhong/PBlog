package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.Comment;
import com.potafish.pblog.dao.repository.CommentRepository;
import com.potafish.pblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment findById(Long id) {
        return commentRepository.findOne(id);
    }
}
