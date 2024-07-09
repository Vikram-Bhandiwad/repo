package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project") 
public class MyprojectController {
	
	@Autowired
    private MyprojectService service;

    @GetMapping
    public List<ProjectData> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ProjectData> findById(@PathVariable Long id) {
        return Optional.ofNullable(new ProjectData());
    }

    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public ProjectData create(@RequestBody ProjectData data) {
        return service.save(data);
    }

    // update a book
    @PutMapping
    public ProjectData update(@RequestBody ProjectData data) {
        return service.save(data);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }


}
