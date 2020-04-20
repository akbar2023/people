package fr.formation.people.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // Cette classe est mappée avec une table
@Table(name = "addresses") // Nom de table != de la classe
public class Address {

	@Id // Ce champ est la clef primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100, nullable = false)
	private String street;

	@Column(length = 50, nullable = false)
	private String city;

	@Column(length = 20, nullable = false)
	private String zipCode; // zip_code en base (stratégie de nommage par défaut de Hibernate)
	
	@Column(length = 30, nullable = false)
	private String country;
	
	// @OneToMany(fetch = FetchType.LAZY)
	
	// private List<Person> persons; 

	public Address() {
		// Default no-args constructor
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", country=" + country + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode
				+ "}";
	}

}
