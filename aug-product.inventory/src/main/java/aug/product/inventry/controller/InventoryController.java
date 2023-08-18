package aug.product.inventry.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import aug.product.inventry.entity.Inventory;
import aug.product.inventry.request.InventoryRequest;
import aug.product.inventry.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	InventoryService service;

	@PostMapping("/addInventory")
	public ResponseEntity<String> addInventory(@RequestBody List<InventoryRequest> request) throws Exception {
		if (request == null) {
			throw new RuntimeException("rqeuest sent to api is null");
		}
		service.addInventory(request);
		return new ResponseEntity<>("Inventory is added", HttpStatus.OK);
	}

	@GetMapping("/searchInventory/{id}")
	public ResponseEntity<Inventory> getInventoryDetails(@PathVariable int id) throws Exception {
		Inventory inventoryList = service.getInventoyDetails(id);
		return new ResponseEntity<>(inventoryList, HttpStatus.OK);
	}
	
	@PutMapping("/updateInventory")
	public ResponseEntity<Inventory> updateInventoryDetails(@RequestBody InventoryRequest request)throws Exception{
		Inventory inventory = service.updateInventory(request);
		return new ResponseEntity<>(inventory,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteInventory/{id}")
	public ResponseEntity<String> deleteInventoryDetails(@PathVariable int id) throws SQLException{
		String s = service.deleteInventoryById(id);
		return new ResponseEntity<>(s,HttpStatus.OK);
		
	}
}
