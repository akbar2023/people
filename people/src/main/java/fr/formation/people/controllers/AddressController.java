package fr.formation.people.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.people.dtos.AddressCreateDto;

@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@PostMapping
	public void create(@RequestBody @Valid AddressCreateDto dto) {
		
		System.out.println(dto);
	}
}
