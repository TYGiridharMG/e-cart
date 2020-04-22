package com.tyss.ecart.dao;

import com.tyss.ecart.model.Cart;
import com.tyss.ecart.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);
	void removeCartItem(long CartItemId);
	void removeAllCartItems(Cart cart);

}
