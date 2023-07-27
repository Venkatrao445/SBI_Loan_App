package com.stock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="USER_MASTER")
@Data
public class User {
	public User(Integer userId, String username, String gender, Integer age, String country) {
		this.userId = userId;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}
	public User() {
		
	}
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "USER_Id")
	private Integer userId;
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", gender=" + gender + ", age=" + age
				+ ", country=" + country + "]";
	}
	@Column(name  = "USER_NAME")
	private String username;
	@Column(name  = "GENDER")
	private String gender;
	@Column(name  = "AGE")
	private Integer age;
	@Column(name  = "COUNTRY")
	private String country;

}
