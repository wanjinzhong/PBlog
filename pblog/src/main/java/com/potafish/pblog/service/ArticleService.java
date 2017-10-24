package com.potafish.pblog.service;

import com.potafish.pblog.dao.entity.ArticleHeader;
import com.potafish.pblog.dao.entity.ArticleRevision;

public interface ArticleService {

    ArticleHeader getArticleHeaderById(Long id);

    ArticleRevision getArticleRevisionById(Long articleId, Integer revision);
}
