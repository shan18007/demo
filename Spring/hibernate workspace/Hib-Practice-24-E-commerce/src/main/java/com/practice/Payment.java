package com.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Payment extends AbstractEntity{

	private String pType;
	
//	@OneToMany(mappedBy = "payment")
//	private List<PurchasedHistory> purchasedHistories;
//	
}
