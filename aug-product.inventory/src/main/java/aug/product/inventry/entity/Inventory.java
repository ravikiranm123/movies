package aug.product.inventry.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Inventory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

	@Id
	@Column(name = "inventory_id",unique =true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inventoryId;

	@Column(name = "product_id",unique =true)
	private int productId;
	
	@Column(name = "quantity",unique =true)
	private int quantity;

}
