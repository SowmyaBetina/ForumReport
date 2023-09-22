package com.prodapt.learningspring.model;
 
public class RegistrationForm {
    private String username;
    private String password;
    private String repeatPassword;
    private String role;

    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public boolean isValid() {
        return password.equals(repeatPassword);
    }

	 
}
