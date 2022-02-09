package com.example.springboot.repository;

import com.example.springboot.dto.PersonDTO;

public interface PersonRepository {

	void persist(PersonDTO personDTO);

}
