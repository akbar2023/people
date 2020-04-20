package fr.formation.people.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.formation.people.entities.Address;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {
	//
}
