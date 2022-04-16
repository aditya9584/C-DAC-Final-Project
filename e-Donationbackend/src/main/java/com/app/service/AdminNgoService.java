package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminNgoRepository;
import com.app.excepe.UserHandlingException;
import com.app.pojo.Ngo;

@Service
@Transactional

public class AdminNgoService implements IAdminNgoService {

	@Autowired
	private AdminNgoRepository adminNgoRepo;
	
	@Override
	public List<Ngo> fetchAllNgo() {
		return adminNgoRepo.findAll();
	}

	@Override
	public Ngo saveNgoDetails(Ngo transientNgo) {
		// TODO Auto-generated method stub
		return adminNgoRepo.save(transientNgo);
	}
	
	@Override
	public String deleteNgoDetails(int ngoID) {
		adminNgoRepo.deleteById(ngoID);
		return "Ngo details deleted";
	}

	@Override
	public Ngo getNgoDetails(int ngoId) {
		return adminNgoRepo.findById(ngoId).orElseThrow(() -> new UserHandlingException("Invalid Ngo Id"));
	}
	
	@Override
	public Ngo updateNgoDetails(Ngo detachedNgo) {
		return adminNgoRepo.save(detachedNgo);
	}
}
