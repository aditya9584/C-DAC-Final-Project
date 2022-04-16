package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.NgoRepository;
import com.app.dto.Login;
import com.app.excepe.UserHandlingException;
import com.app.pojo.Ngo;

public class NgoService implements INgoService {

	public NgoService() {
		System.out.println("In a ngo service ");
	}
	
	@Autowired
	NgoRepository ngoRepo;
	
	@Override
	public String saveNgo(Ngo ngo) {
		System.out.println("in a service save ngo");
		Ngo newNgo=ngoRepo.save(ngo);
		
		return "Ngo Added Successfully";
	}
	
	@Override
	public Ngo loginAsANgo(Login login) {
		Ngo ngo = ngoRepo.findByEmail(login.getEmail());
		if (ngo.getPassword().equals(login.getPassword())) {
			return ngo;
		}
		throw new UserHandlingException("Invalid Details of Ngo");
		
	}

	@Override
	public Ngo getNgoById(int ngoId) {
		return ngoRepo.findById(ngoId).orElseThrow(() -> new UserHandlingException("Invalid Ngo ID"));
	}
}
