package com.practice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PurchasedHistory extends AbstractEntity{

	@JoinColumn(name = "purchased_date")
	private Date date;
	private String status;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private User user;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Product product;
	
}
