package com.app.service;

import java.util.List;

import com.app.pojo.Ngo;

public interface IAdminNgoService {

	List<Ngo>fetchAllNgo();
	
	  Ngo saveNgoDetails(Ngo transientNgo);
		
		String deleteNgoDetails(int ngoId);
		
		Ngo getNgoDetails(int ngoId);
		
		Ngo updateNgoDetails(Ngo detachedNgo);
}
