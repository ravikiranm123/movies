package aug.product.inventry.store.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aug.product.inventry.store.entity.Inventory;
import aug.product.inventry.store.repository.InventoryRepository;
import aug.product.inventry.store.request.InventoryRequest;
import aug.product.inventry.store.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryRepository repo;

	@Override
	public void addInventory(List<InventoryRequest> request) throws SQLException {
		try {
			List<Inventory> list = entityList(request);
			repo.saveAll(list);
		} catch (Exception ex) {
			throw new SQLException();
		}
	}

	private List<Inventory> entityList(List<InventoryRequest> request) {
		return request.stream().map(o -> {
			Inventory inventory = new Inventory();
			inventory.setProductId(o.getInventoryId());
			inventory.setQuantity(o.getQuantity());
			return inventory;
		}).toList();
	}

}
