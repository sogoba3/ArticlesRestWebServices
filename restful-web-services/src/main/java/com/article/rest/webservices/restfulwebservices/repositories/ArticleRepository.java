package com.article.rest.webservices.restfulwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.article.rest.webservices.restfulwebservices.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
