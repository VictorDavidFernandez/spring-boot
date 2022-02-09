package com.example.springboot.repository;

import org.springframework.stereotype.Service;

import com.example.springboot.dto.PersonDTO;

@Service
public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public void persist(final PersonDTO personDTO) {
		// implementation of persisting to database
	}
}
