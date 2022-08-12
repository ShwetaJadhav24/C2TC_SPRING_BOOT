package com.sms.shopowner;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopOwnerController {
	
	@Autowired
	private ShopOwnerService service;

	    //RESTful API methods for Retrieval operations
		@GetMapping("/shopOwners")
		public List<ShopOwner> list() {
			return service.listAll();
		}

		@GetMapping("/shopOwners/{id}")
		public ResponseEntity<ShopOwner> get(@PathVariable Integer id) {
			try {
				ShopOwner shopOwner = service.get(id);
				return new ResponseEntity<ShopOwner>(shopOwner, HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Create operation
		@PostMapping("/shopowners")
		public void add(@RequestBody ShopOwner shopOwner) {
			service.save(shopOwner);
		}

		// RESTful API method for Update operation
		@PutMapping("/shopOwners/{id}")
		public ResponseEntity<?> update(@RequestBody ShopOwner shopOwner, @PathVariable Integer id) {
			try {
				ShopOwner existshopOwner = service.get(id);
				service.save(shopOwner);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Delete operation
		@DeleteMapping("/shopOwners/{id}")
		public void delete(@PathVariable Integer id) {
			service.delete(id);
		}

}
