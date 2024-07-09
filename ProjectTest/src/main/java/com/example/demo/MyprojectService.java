package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Service
public class MyprojectService {

	@Autowired
    private DataRepo dataRepo;
    
	@GetMapping
	public List<ProjectData> findAll() {
		// TODO Auto-generated method stub
		return dataRepo.findAll();
	}
	@GetMapping("/{id}")
	public Optional<ProjectData> findById(@PathVariable (value = "id") long id) {
		// TODO Auto-generated method stub
		return dataRepo.findById(id);
	}
@PostMapping
	public ProjectData save(@RequestBody ProjectData data) {
		// TODO Auto-generated method stub
	return this.dataRepo.save(data);
	}
@DeleteMapping
	public void deleteById(@PathVariable (value = "id") long id) {
		 dataRepo.deleteById( id);
		
	}

}
