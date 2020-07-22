package com.icarodebarros.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.icarodebarros.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	// Documentação: https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#reference
	// Buscar pela sessão "Query Methods"
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	// OU
	
	//Documentação: https://docs.mongodb.com/manual/reference/operator/query/regex/
	//@Query("{ <field>: { $regex: /pattern/, $options: '<options>' } }")
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") // ?0 -> primeito parametro; i -> ingnore case
	List<Post> searchTitle(String text);
	
	

}
