package aug.product.inventry.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aug.product.inventry.store.request.InventoryRequest;
import aug.product.inventry.store.service.InventoryService;
import jakarta.validation.constraints.NotNull;

@RestController
public class InventoryController {

	@Autowired
	InventoryService service;

	@PostMapping("/addInventory")
	public ResponseEntity<String> addInventory(@RequestBody @NotNull List<InventoryRequest> request) throws Exception {
		if(request==null) {
			throw new RuntimeException("rqeuest sent to api is null");
		}
		service.addInventory(request);
		return new ResponseEntity<>("Inventory is added", HttpStatus.OK);
	}

}
