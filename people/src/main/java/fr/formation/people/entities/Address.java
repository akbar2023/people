package fr.formation.people.entities;

public class Address {
	
	private Long id;
	private String country;
	private String street;
	private String city;
	private String zipCode;
	
	public Address() {
		
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", street=" + street + ", city=" + city + ", zipCode="
				+ zipCode + "]";
	}

	
	
}
