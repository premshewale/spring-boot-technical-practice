package com.example.demo.services;

import java.util.List;

import com.example.demo.bean.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	void addnewProduct(Product product);
	Product getById(int pid);
	int updateProduct(Product product);
	void deleteById(int pid);
	
}
