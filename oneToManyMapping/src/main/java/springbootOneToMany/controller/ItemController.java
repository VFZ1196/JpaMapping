package springbootOneToMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootOneToMany.model.Items;
import springbootOneToMany.repository.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository ItemRepo;
	
	@GetMapping("/item")
	public List<Items> getAll(){
		return ItemRepo.findAll();
	}

}
