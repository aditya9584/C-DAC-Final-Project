package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Ngo;
import com.app.service.IAdminNgoService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")

public class AdminNgoController {

	@Autowired
	private IAdminNgoService adminNgoService;
	
	public AdminNgoController(){
		System.out.println("in ctor of "+ getClass().getName());
	}

	
	@GetMapping("/ngo")
	public List<Ngo> getAllNgo(){
		System.out.println("in get all ngos");
		return adminNgoService.fetchAllNgo();
	}
	
	@PostMapping("/ngo-add")
	public ResponseEntity<?> saveNgo(@RequestBody Ngo ngo) {
		System.out.println("in save ngo "+ngo);
		return new ResponseEntity<>(adminNgoService.saveNgoDetails(ngo), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/{ngoId}")
	public ResponseEntity<?> deleteNgoDetails(@PathVariable int ngoId){
		System.out.println("in del ngo details "+ ngoId);
		return ResponseEntity.ok(adminNgoService.deleteNgoDetails(ngoId));
	}
	
	@GetMapping("/{ngoId}")
	public ResponseEntity<?> getNgoDetails(@PathVariable int ngoId){
		System.out.println("in get ngo details "+ngoId);
		return ResponseEntity.ok(adminNgoService.getNgoDetails(ngoId));
	}
	
	@PutMapping("/{ngoId}")
	public ResponseEntity<?> updateNgoDetails(@PathVariable int ngoId,@RequestBody Ngo detachedNgo){
		System.out.println("in update "+detachedNgo+" "+ngoId);
		return ResponseEntity.ok(adminNgoService.updateNgoDetails(detachedNgo));
	}
}
