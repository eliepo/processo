package com.promad.test.processo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promad.test.processo.entities.Reu;
import com.promad.test.processo.repositories.ReuRepository;


@Service
public class ReuService {
	
	@Autowired
	private ReuRepository repository;
	
	public List<Reu> findAll() {
		return repository.findAll();
	}
	
	public Reu findById(Long id) {
		Optional<Reu> obj = repository.findById(id);
		return obj.get();
	}

}
