package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.Feedback;
import com.potafish.pblog.dao.repository.FeedbackRepository;
import com.potafish.pblog.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback findById(Long id) {
        return feedbackRepository.findOne(id);
    }
}
