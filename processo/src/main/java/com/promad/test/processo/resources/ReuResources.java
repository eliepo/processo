package com.promad.test.processo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promad.test.processo.entities.Reu;
import com.promad.test.processo.services.ReuService;

@RestController
@RequestMapping(value = "/reus")
public class ReuResources {
	
	@Autowired
	private ReuService service;
	
    @GetMapping
	public ResponseEntity<List<Reu>> findAll() {
		
    	List<Reu> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
    
    @GetMapping(value = "{id}")
    public ResponseEntity<Reu> findById(@PathVariable Long id){
    	Reu obj = service.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
}
