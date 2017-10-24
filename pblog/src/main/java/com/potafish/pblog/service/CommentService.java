package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.Comment;

public interface CommentService {

    Comment findById(Long id);
}
