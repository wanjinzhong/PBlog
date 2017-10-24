package com.potafish.pblog.dao.repository;

import com.potafish.pblog.dao.entity.ArticleHeader;
import com.potafish.pblog.dao.entity.ArticleRevisionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleHeaderRepository extends JpaRepository<ArticleHeader, Long>{
}
