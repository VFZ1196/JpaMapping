package springbootOneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootOneToMany.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
