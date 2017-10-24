package com.potafish.pblog.dao.repository;

import com.potafish.pblog.dao.entity.ArticleRevisionId;
import com.potafish.pblog.dao.entity.ArticleRevision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRevisionRepository extends JpaRepository<ArticleRevision, ArticleRevisionId>{
}
