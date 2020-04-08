	package com.rtpl.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rtpl.customer.dao.CustomerDAO;

@Service
public class CustomerService {

	
	@Autowired
	CustomerDAO	customerDAO;
	
	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
	
}
