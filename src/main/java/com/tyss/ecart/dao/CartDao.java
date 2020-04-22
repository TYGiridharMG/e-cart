package com.tyss.ecart.dao;

import java.io.IOException;

import com.tyss.ecart.model.Cart;

public interface CartDao {

	Cart getCartByCartId(long CartId);
	
	Cart validate(long cartId) throws IOException;
	
	void update(Cart cart);
}
