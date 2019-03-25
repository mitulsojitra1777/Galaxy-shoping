package com.srinathji.shopngback.dao;

import java.util.List;

import com.srinathji.shopngback.dto.Product;

public interface ProductDao {
	
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
	List<Product> list();
	Product getProductById(int id);
	

}
