package com.tyss.ecart.service;

import java.util.List;

import com.tyss.ecart.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
