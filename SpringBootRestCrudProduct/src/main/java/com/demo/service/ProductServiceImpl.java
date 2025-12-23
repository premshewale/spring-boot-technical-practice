package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productDao;
	@Override
	public List<Product> getAllProduct() {
		return productDao.findAll();
	}
	@Override
	public void addnewProduct(Product product) {
		productDao.save(product);
		
	}	
	@Override
	public void deleteById(int pid) {
		productDao.deleteById(pid);
		
	}
	
	
	

	@Override
	public Product getById(int pid) {
		Optional<Product> op=productDao.findById(pid);
		/*if(op.isPresent()) {
			return op.get();
		}
		return null;*/
		return op.orElse(null);
	}
	
	
	
	
	
	

	@Override
	public int updateProduct(Product product) {
		Optional<Product> op=productDao.findById(product.getPid());
		if(op.isPresent()) {
			Product p=op.get();
			p.setPname(product.getPname());
			p.setQty(product.getQty());
			p.setPrice(product.getPrice());
			productDao.save(p);
			return 1;
		}
		return 0;
	}

	
	
	

}
