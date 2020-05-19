package com.article.rest.webservices.restfulwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.article.rest.webservices.restfulwebservices.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
