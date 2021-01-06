package springbootOneToMany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import springbootOneToMany.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	
	//@Query(value="select * from cart order by cart_id Desc", nativeQuery = true)

	@Query(value= "select cart.cart_id,cart.cart_name,items.item_name from cart join items on cart.cart_id=items.cart_id"
			,nativeQuery = true)
		List<Cart> findAll();

}
