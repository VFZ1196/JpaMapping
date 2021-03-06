package springbootOneToMany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private long id;
	
	@Column
	private String cartName;

	//@OneToMany(mappedBy = "cart")
	//private List<Items> item;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
/*
	public List<Items> getItem() {
		return item;
	}

	public void setItem(List<Items> item) {
		this.item = item;
	}
*/
}
