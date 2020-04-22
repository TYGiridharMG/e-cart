package com.tyss.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyss.ecart.model.Cart;
import com.tyss.ecart.model.Customer;
import com.tyss.ecart.service.CartService;
import com.tyss.ecart.service.CustomerService;

@Controller
public class CartController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CartService cartService;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("cart/getCartById")
	public String getCartId(Model model){
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String emailId = user.getUsername();
		Customer customer = customerService.getCustomerByemailId(emailId);
		model.addAttribute("cartId", customer.getCart().getCartId());
		return "cart";
	}
	
	@RequestMapping("/cart/getCart/{cartId}")
	public @ResponseBody Cart getCartItems(@PathVariable(value="cartId")long cartId){
		return cartService.getCartByCartId(cartId);
	}
	
}
