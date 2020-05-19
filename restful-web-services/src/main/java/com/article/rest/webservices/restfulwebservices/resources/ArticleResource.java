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

import com.article.rest.webservices.restfulwebservices.entities.Article;
import com.article.rest.webservices.restfulwebservices.entities.Author;
import com.article.rest.webservices.restfulwebservices.repositories.ArticleRepository;
import com.article.rest.webservices.restfulwebservices.repositories.AuthorRepository;

@RestController
@RequestMapping("/article")
public class ArticleResource {
	
	@Autowired
	private ArticleRepository articleRepo;
	
	@Autowired
	private AuthorRepository authorRepo;
	
	// retrieved all diaries of author
	
	@GetMapping("/authors/{id}/articles")
	public List<Article> retrievedAllAuthorArticles(@PathVariable int id) {
		
		Optional<Author> author = this.authorRepo.findById(id);
		
		return author.get().getArticle();
		
	}
	
	// Create diaries for authors
	// "authors/{id}/diaries"
	@PostMapping("/authors/{id}/articles")
	public Article createArticlesForAuthors(@PathVariable int id, @RequestBody Article article) {
		
		Optional<Author> authorOptional = this.authorRepo.findById(id);
		
		Author author = authorOptional.get();
		
		article.setAuthor(author);
		
		return this.articleRepo.save(article);
	}
	
	// retrieve details of a diary
	//"authors/{id}/diaries/{id}
	
	@GetMapping("/authors/{authorId}/articles/{diaryId}")
	public Optional<Article> retrievedDetailsOfAArticle(@PathVariable int authorId, @PathVariable int articleId, @RequestBody Optional<Author> author) {
		Optional<Author> authorOptional = this.authorRepo.findById(authorId);
		
		author = authorOptional;
		
		Optional<Article> articleOptional = this.articleRepo.findById(articleId);
		
		articleOptional.get().getAuthor();
		
		return articleOptional;
		
	}
	
	// delete an author diary
	// "authors/{id}/diaries/{id}
	@DeleteMapping("/authors/{authorId}/articles/{articleId}")
	public void DeleteAuthorArticle(@PathVariable int authorId, @PathVariable int articleId) {
		
		Optional<Author> authorOptional = this.authorRepo.findById(authorId);
		
		articleId = authorOptional.get().getId();
		

		this.articleRepo.deleteById(articleId);
		
	}
	

}









