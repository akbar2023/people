package fr.formation.people.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class PersonCreateDto {

	@Size(min = 1, max = 255)
	@NotBlank
	private String firstName;

	@Size(min = 1, max = 255)
	@NotBlank
	private String lastName;

	@NotNull
	@Past
	private LocalDate birthDate;

	public PersonCreateDto() {
		// Default no-args constructor
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

	@Override
	public String toString() {
		return "{firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + "}";
	}

}
