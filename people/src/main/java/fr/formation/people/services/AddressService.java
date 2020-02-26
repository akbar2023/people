package fr.formation.people.services;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.dtos.AddressDto;

public interface AddressService {
	
	void create(AddressCreateDto dto);

	void delete(Long id);

	AddressDto get(Long id);
	
}
