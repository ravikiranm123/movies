package aug.product.inventry.store.service;

import java.sql.SQLException;
import java.util.List;

import aug.product.inventry.store.request.InventoryRequest;

public interface InventoryService {

	void addInventory(List<InventoryRequest> request)throws SQLException;

}
