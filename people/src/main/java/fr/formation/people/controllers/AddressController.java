package fr.formation.people.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.dtos.AddressDto;
import fr.formation.people.services.AddressService;

// Définir un ensemble de endpoints
// pour un type de ressources (Address).
// Conventions : l'entité en minuscules, pluralisé, en Rest = une collection d'adresses
@RestController
@RequestMapping("/addresses") // http://localhost:8082/addresses
@CrossOrigin
public class AddressController {

	// Inject une instance de AddressServiceImpl.
	// AddressServiceImpl doit etre annotée @Service
	// @Autowired ou par constructeur
	private final AddressService service;

	// Injection par constructeur, permet de marquer
	// le champ service comme final (non réassignable)
	public AddressController(AddressService service) {
		this.service = service;
	}

	@PostMapping // POST "/addresses" avec un JSON dans le corps de la requête
	public AddressDto create(@RequestBody @Valid AddressCreateDto dto) {
		return service.create(dto);
	}

	@DeleteMapping("/{id}") // DELETE "/addresses/1" ou 1 correspond à l'id d'une adresse existante en bdd
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

	@GetMapping("/{id}") // GET "/addresses/1" ou 1 correspond à l'id d'une adresse existante en bdd
	public AddressDto get(@PathVariable("id") Long id) {
		return service.get(id);
	}
	
	@GetMapping // GET "/addresses" pas d'id, retourne toute la collection de ressources
	public List<AddressDto> getAll() {
		return service.getAll();
	}

	@GetMapping("/street/{street}")
	public List<AddressDto> searchByStreet(@PathVariable("street") String street) {
		return service.getAllByStreet(street);
	}

}
