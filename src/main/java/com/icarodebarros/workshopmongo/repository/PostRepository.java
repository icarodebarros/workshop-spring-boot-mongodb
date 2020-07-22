package com.icarodebarros.workshopmongo.repository;

import java.util.Date;
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
	
	@Query("{ $and: [ { date: {$gte: ?1} }, { date: {$lte: ?2} }, { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);

}
