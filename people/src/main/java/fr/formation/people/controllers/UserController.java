package fr.formation.people.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.people.dtos.UserCreateDto;
import fr.formation.people.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping
	public void create(@Valid @RequestBody UserCreateDto dto) {
		service.create(dto);
	}
}
