package com.icarodebarros.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icarodebarros.workshopmongo.domain.User;
import com.icarodebarros.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return this.repo.findAll();
	}
	
}
