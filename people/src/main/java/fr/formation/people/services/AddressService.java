package fr.formation.people.services;

import fr.formation.people.entities.Address;
import java.util.List;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.dtos.AddressDto;

public interface AddressService {
	
	AddressDto create(AddressCreateDto dto);

	void delete(Long id);

	AddressDto get(Long id);

	Address getById(Long id);

	List<AddressDto> getAll();

	List<AddressDto> getAllByStreet(String street);
}
