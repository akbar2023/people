package fr.formation.people.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.people.dtos.PersonCreateDto;
import fr.formation.people.dtos.PersonDto;
import fr.formation.people.entities.Person;
import fr.formation.people.repositories.PersonJpaRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	private final PersonJpaRepository repository;
	
	public PersonServiceImpl(PersonJpaRepository repository) {
		this.repository = repository;
	}

	@Override
	public void create(PersonCreateDto dto) {
		Person person = new Person();
		person.setFirstName(dto.getFirstName());
		person.setLastName(dto.getLastName());
		person.setBirthDate(dto.getBirthDate());
		repository.save(person);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public PersonDto get(Long id) {
		Person person = repository.findById(id).get();
		return convertFrom(person);
	}

	@Override
	public List<PersonDto> getAll() {
		List<Person> persons = repository.findAll();
		List<PersonDto> dtos = new ArrayList<>();
		for (Person person : persons) {
			PersonDto dto = convertFrom(person);
			dtos.add(dto);
		}
		return dtos;
	}
	
	private PersonDto convertFrom(Person person) {
		PersonDto dto = new PersonDto();
		dto.setFirstName(person.getFirstName());
		dto.setLastName(person.getLastName());
		return dto;
	}

}
