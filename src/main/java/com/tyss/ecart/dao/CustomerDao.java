package com.tyss.ecart.dao;

import java.util.List;

import com.tyss.ecart.model.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
