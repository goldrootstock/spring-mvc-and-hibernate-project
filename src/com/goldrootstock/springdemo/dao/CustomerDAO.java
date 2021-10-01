package com.goldrootstock.springdemo.dao;

import java.util.List;

import com.goldrootstock.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
