package com.example.service.springbootrewards.rewards;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Service;

import com.example.service.springbootrewards.model.Customer;
import com.example.service.springbootrewards.model.CustomerTransaction;

@Service
public class RewardsServiceMock {

	private static List<CustomerTransaction> transactions = new ArrayList<CustomerTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new CustomerTransaction(index++, new Customer(1, "Marco"), 100.0, "Purchase 1", new Date()) );
		transactions.add( new CustomerTransaction(index++, new Customer(2, "Luis"), 50.0, "Purchase 2", new Date()) );
		transactions.add( new CustomerTransaction(index++, new Customer(3, "Karla"), 120.0, "Purchase 3", new Date()) );
	
	}
	
	
	public List<CustomerTransaction> getAll() {
		return transactions;
	}
	
}



