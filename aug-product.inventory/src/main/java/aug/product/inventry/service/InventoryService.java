package aug.product.inventry.service;

import java.sql.SQLException;
import java.util.List;

import aug.product.inventry.entity.Inventory;
import aug.product.inventry.request.InventoryRequest;

public interface InventoryService {

	void addInventory(List<InventoryRequest> request)throws SQLException;
	Inventory getInventoyDetails(int id) throws Exception;
	Inventory updateInventory(InventoryRequest request) throws Exception;
	String deleteInventoryById(int id) throws SQLException;

}
