package fr.formation.people.dtos;

public class AddressDto {

	private Long id;
	
	private String street;

	private String city;

	private String zipCode;

	private String country;


	public AddressDto() {

	}

	public AddressDto(Long id, String street, String city, String zipCode, String country) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	public Long getId() {
		return id;
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
		return "{country=" + country + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode
				+ "}";
	}

}
