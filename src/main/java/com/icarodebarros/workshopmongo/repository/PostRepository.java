package com.icarodebarros.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.icarodebarros.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	// Documentação: https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#reference
	// Buscar pela sessão "Query Methods"
	List<Post> findByTitleContainingIgnoreCase(String text);

}
