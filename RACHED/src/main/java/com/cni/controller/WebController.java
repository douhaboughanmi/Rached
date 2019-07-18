package com.cni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cni.entity.organisme;

import com.cni.service.OrganismeService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class WebController {
	
@Autowired	
OrganismeService service;

@PostMapping("/save")
public organisme save(@RequestBody organisme organi){
	service.saveorUpdate(organi);
	return organi;
}

@GetMapping("/list")
public List<organisme> list(){
	return service.getAllorOrganismes();
}

@GetMapping("/list/{id}")
public organisme getById(@PathVariable long id) {
	return service.getByidOrganisme(id);
}

@DeleteMapping("/delete/{id}")
public String deleteOrganise(@PathVariable(value = "id")Long id){
	service.deleteOrganisme(id);
	return "Delete Succsefully id = "+id;
}


}

























