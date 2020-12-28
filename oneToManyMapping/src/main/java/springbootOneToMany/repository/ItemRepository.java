package springbootOneToMany.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootOneToMany.model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Long>{

	
}
