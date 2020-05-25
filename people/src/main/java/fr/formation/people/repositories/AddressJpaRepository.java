package fr.formation.people.repositories;

import fr.formation.people.dtos.AddressDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.formation.people.entities.Address;

import java.util.List;

@Repository // Option
public interface AddressJpaRepository extends JpaRepository<Address, Long> {
	//


    @Query("SELECT a FROM Address a WHERE LOWER(a.street) LIKE LOWER(concat('%', :street,'%'))")
    List<Address> findAllByStreet(@Param("street") String street);

//    List<Address> findAllByStreetIgnoreCase(String street);

}
