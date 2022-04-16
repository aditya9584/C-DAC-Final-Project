package com.app.service;

import com.app.dto.Login;
import com.app.pojo.Ngo;

public interface INgoService {

	String saveNgo(Ngo ngo);

	Ngo getNgoById(int ngoId);

	Ngo loginAsANgo(Login login);

}
