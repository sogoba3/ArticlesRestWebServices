package com.article.rest.webservices.restfulwebservices.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.article.rest.webservices.restfulwebservices.entities.Author;
import com.article.rest.webservices.restfulwebservices.repositories.AuthorRepository;

@RestController
@RequestMapping("/diary")
public class AuthorResource {

	@Autowired
	private AuthorRepository authorRepository;
	
	// "/author"
	// This method gets all the authors 
	@GetMapping("/authors")
	public List<Author> retrievedAllAuthors() {
		
		return authorRepository.findAll();
	}
	
	//this method retrieved a single author depending on id
	//Retrieved one  "authors/{id}"
	@GetMapping("/authors/{id}")
	public Optional<Author> retrivedAuthor(@PathVariable int id) {
		Optional<Author> author = this.authorRepository.findById(id);
		
		if(!author.isPresent()) {
			System.out.println("Sorry, this Author does not exist");
		}
		return author;
		
	}
	
	//this method delete an author
	// Delete "authors/{id}
	
	@DeleteMapping("/authors/{id}")
	public void deleteAuthor(@PathVariable int id) {
		
		this.authorRepository.deleteById(id);
	}
	
	// this method will add new authors
	// Post "authors"
	
	@PostMapping("/authors")
	public Author saveAuthor(@RequestBody Author author) {
		return this.authorRepository.save(author);
	}
	
}











