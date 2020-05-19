package com.article.rest.webservices.restfulwebservices.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy = "author")
	private List<Article> article;
	
	public Author() {
		super();
	}


	public Author(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	


	public List<Article> getArticle() {
		return article;
	}


	public void setDiary(List<Article> article) {
		this.article = article;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
