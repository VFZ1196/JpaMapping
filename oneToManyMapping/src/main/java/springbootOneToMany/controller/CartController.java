package springbootOneToMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootOneToMany.model.Cart;
import springbootOneToMany.repository.CartRepository;

@RestController
public class CartController {
	
	@Autowired
	CartRepository cartRepository;
	
	@GetMapping("/cart")
	public List<Cart> getAll(){
		return cartRepository.findAll();
	}
}
