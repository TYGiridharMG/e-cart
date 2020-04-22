package com.tyss.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tyss.ecart.dao.CustomerDao;
import com.tyss.ecart.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	// The database transaction happens inside the scope of a persistence
	// context. The persistence context is in JPA the EntityManager ,
	// implemented internally using an Hibernate Session (when using Hibernate
	// as the persistence provider).

	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public List<Customer> getAllCustomers() {

		return customerDao.getAllCustomers();
	}

	public Customer getCustomerByemailId(String emailId) {
		return customerDao.getCustomerByemailId(emailId);
	}

}
