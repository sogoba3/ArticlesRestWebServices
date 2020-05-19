package com.article.rest.webservices.restfulwebservices.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Article {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Author author;
	

	public Article() {
		super();
	}

	public Article(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", author=" + author + "]";
	}

	
	

}
