package fr.formation.people.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserCreateDto {

	@Size(max = 256)
	@NotNull
	@Email
	private String username;

	@Size(min = 8, max = 20)
	@NotEmpty
	private String password;

	public UserCreateDto() {
		// Pour Jackson
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "{username=" + username + ", password=[PROTECTED]}";
	}

}
