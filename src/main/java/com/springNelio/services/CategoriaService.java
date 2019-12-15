package com.springNelio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springNelio.domain.Categoria;
import com.springNelio.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id) ;
		//Categoria obj = repo.findOne(id);
		return obj.orElse(null);
		
	}

}
