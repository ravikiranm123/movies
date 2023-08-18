package aug.product.inventry.store.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryRequest {

	private int inventoryId;
	private int productId;
	private int quantity;

}
