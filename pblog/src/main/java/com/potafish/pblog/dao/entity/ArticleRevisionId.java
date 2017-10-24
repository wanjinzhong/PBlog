package com.potafish.pblog.dao.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ArticleRevisionId implements Serializable{

    private static final long serialVersionUID = 9106241363826645658L;
    private Long articleId;

    private Integer revision;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }
}
