package fr.formation.people.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.formation.people.dtos.UserCreateDto;
import fr.formation.people.entities.Role;
import fr.formation.people.entities.User;
import fr.formation.people.repositories.RoleJpaRepository;
import fr.formation.people.repositories.UserJpaRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserJpaRepository userRepo;

	private final RoleJpaRepository roleRepo;

	private final PasswordEncoder encoder;

	public UserServiceImpl(UserJpaRepository userRepo, RoleJpaRepository roleRepo, PasswordEncoder encoder) {
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
		this.encoder = encoder;
	}

	@Override
	public void create(UserCreateDto dto) {
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(encoder.encode(dto.getPassword()));
		user.setEnabled(true);
		Role role = roleRepo.findByDefaultRoleTrue();
		user.setRole(role);
		userRepo.save(user);
	}

}
