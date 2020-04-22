package com.tyss.ecart.service;

import com.tyss.ecart.model.CustomerOrder;

public interface CustomerOrderService {

	void addCustomerOrder(CustomerOrder customerOrder);
	double getCustomerOrderGrandTotal(long cartId);
}
