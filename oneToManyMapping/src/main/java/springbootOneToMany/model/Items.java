package springbootOneToMany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private long cartId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="item_type")
	private String itemType;
	
	//@JoinColumn(name="cart_id")
	@ManyToOne(targetEntity = Cart.class)
	private Cart cart;

	public long getItemId() {
		return cartId;
	}

	public void setItemId(long itemId) {
		this.cartId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
