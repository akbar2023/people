package fr.formation.people.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import fr.formation.people.entities.Address;

@Entity
@Table(name = "persons")
public class Person {

	// 1 person => 1 address => OneToOne
	// 1 address => n person => ManyToOne

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false) // length par défaut = 255
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private LocalDate birthDate; // birth_date (nommage par défaut Hibernate)

	@Transient // Rare mais permet d'ignorer un champ dans le mapping en base
	private Integer phone;

	// Mapping unidirectionnel
	//
	@ManyToOne
	@JoinColumn(nullable = true)
	private Address address; // 123 rue Toto

	public Person() {
		//
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", phone=" + phone + ", address=" + address + "}";
	}

}
