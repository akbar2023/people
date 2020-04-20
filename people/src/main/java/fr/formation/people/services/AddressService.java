package fr.formation.people.services;

import java.util.List;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.dtos.AddressDto;

public interface AddressService {
	
	void create(AddressCreateDto dto);

	void delete(Long id);

	AddressDto get(Long id);

	List<AddressDto> getAll();
	
}
