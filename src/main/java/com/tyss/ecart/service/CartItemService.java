package com.tyss.ecart.service;

import com.tyss.ecart.model.Cart;
import com.tyss.ecart.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(long CartItemId);
	void removeAllCartItems(Cart cart);
}
