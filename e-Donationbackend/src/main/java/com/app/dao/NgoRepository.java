package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.pojo.Ngo;

public interface NgoRepository extends CrudRepository<Ngo, Integer>{
	Ngo findByEmail(String email);

}
