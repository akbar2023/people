package fr.formation.people.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.people.entities.Address;

@Repository // Option
public interface AddressJpaRepository extends JpaRepository<Address, Long> {
	//
}
