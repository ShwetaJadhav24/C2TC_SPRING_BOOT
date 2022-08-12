package com.sms.shopowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ShopOwnerService {
	
	@Autowired
	private ShopOwnerRepository repo;

	public List<ShopOwner> listAll() {
		return repo.findAll();
	}

	public ShopOwner save(ShopOwner shopOwner) {
		repo.save(shopOwner);
		return shopOwner;
	}

	public ShopOwner get(Integer id) {
		ShopOwner shopOwner = repo.findById(id).get();
		return shopOwner;
	}

	public ShopOwner delete(Integer id) {
		ShopOwner shopOwner = repo.findById(id).get();
		repo.deleteById(id);
		return shopOwner;
	}

}
