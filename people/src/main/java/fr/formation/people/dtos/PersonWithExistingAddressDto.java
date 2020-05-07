package fr.formation.people.dtos;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class PersonWithExistingAddressDto {

    @Size(min = 1, max = 255)
    @NotBlank
    private String firstName;

    @Size(min = 1, max = 255)
    @NotBlank
    private String lastName;

    @NotNull
    @Past
    private LocalDate birthDate; // (default JSON format YYYY-MM-DD) => Jackson

    @NotNull
    private Long address;

    public PersonWithExistingAddressDto() {
    }

//    public PersonWithExistingAddressDto(String firstName, String lastName, LocalDate birthDate, Long address) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthDate = birthDate;
//        this.address = address;
//    }


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

    public Long getAddress() {
        return address;
    }

    public void setAddress(Long address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonWithExistingAddressDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }
}
