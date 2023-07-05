package com.practice;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class User extends AbstractEntity{

	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String username;
	private String email;
	@Column(length = 60)
	private String password;
	@Column(length = 1200)
	private String address;
	
	@ManyToMany(mappedBy = "user")
	private List<PurchasedHistory> purchasedHistories;
}
