package fr.formation.people.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.people.entities.Person;

public interface PersonJpaRepository extends JpaRepository<Person, Long> {
	//
}
