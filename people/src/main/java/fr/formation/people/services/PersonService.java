package fr.formation.people.services;

import java.util.List;

import fr.formation.people.dtos.PersonCreateDto;
import fr.formation.people.dtos.PersonDto;

public interface PersonService {
	
	void create(PersonCreateDto dto);

	void delete(Long id);

	PersonDto get(Long id);

	List<PersonDto> getAll();

}
