package aug.product.inventry.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aug.product.inventry.entity.Inventory;
import aug.product.inventry.repository.InventoryRepository;
import aug.product.inventry.request.InventoryRequest;
import aug.product.inventry.service.InventoryService;

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
			inventory.setProductId(o.getProductId());
			inventory.setQuantity(o.getQuantity());
			return inventory;
		}).toList();
	}

	@Override
	public Inventory getInventoyDetails(int id) throws Exception {
		Optional<Inventory> inventory = repo.findById(id);
		if (!inventory.isPresent()) {
			throw new Exception("no data in database with the given id");
		}
		return inventory.get();
	}

	@Override
	public Inventory updateInventory(InventoryRequest request) throws Exception {
		Optional<Inventory> inventory = repo.findById(request.getInventoryId());
		if (!inventory.isPresent()) {
			throw new Exception("no data avalibale in database for given id");
		}
		Inventory inv = inventory.get();
		inv.setProductId(request.getProductId());
		inv.setQuantity(request.getQuantity());
		try {
			repo.save(inv);
		} catch (Exception ex) {
			throw new SQLException(ex.getMessage());
		}
		return inv;
	}

	@Override
	public String deleteInventoryById(int id) throws SQLException {
		try {
		repo.deleteById(id);
		}
		catch (Exception ex) {
			throw new SQLException(ex.getMessage());
		}
		return "successfully deleted By id";
		
	}

}
