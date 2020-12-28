package springbootOneToMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springbootOneToMany.model.Cart;
import springbootOneToMany.model.Items;
import springbootOneToMany.repository.CartRepository;

@RestController
public class CartController {
	
	@Autowired
	CartRepository repo;
	
	@GetMapping("/cart")
	public List<Cart> getAll(){
		return repo.findByOrderById();
	}
	/*
	@PostMapping("/cart")
	public Cart add(@RequestBody Cart c) {
		return repo.save(c);
	}
*/
}
