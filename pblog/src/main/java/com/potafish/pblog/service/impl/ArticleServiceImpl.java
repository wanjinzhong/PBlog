package com.potafish.pblog.service.impl;

import com.potafish.pblog.dao.entity.ArticleHeader;
import com.potafish.pblog.dao.entity.ArticleRevision;
import com.potafish.pblog.dao.entity.ArticleRevisionId;
import com.potafish.pblog.dao.repository.ArticleHeaderRepository;
import com.potafish.pblog.dao.repository.ArticleRevisionRepository;
import com.potafish.pblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleHeaderRepository articleHeaderRepository;

    @Autowired
    private ArticleRevisionRepository articleRevisionRepository;

    @Override
    public ArticleHeader getArticleHeaderById(Long id) {
        return articleHeaderRepository.findOne(id);
    }

    @Override
    public ArticleRevision getArticleRevisionById(Long articleId, Integer revision) {
        ArticleRevisionId articleRevisionId = new ArticleRevisionId();
        articleRevisionId.setArticleId(articleId);
        articleRevisionId.setRevision(revision);
        return articleRevisionRepository.findOne(articleRevisionId);
    }
}
