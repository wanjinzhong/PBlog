package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.Feedback;

public interface FeedbackService {

    Feedback findById(Long id);
}
