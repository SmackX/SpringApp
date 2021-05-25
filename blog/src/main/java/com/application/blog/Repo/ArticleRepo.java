package com.application.blog.Repo;

import com.application.blog.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepo extends CrudRepository <Article, Long> {
}
