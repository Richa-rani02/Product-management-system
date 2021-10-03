package com.example.CRUD.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUD.Model.Product;
import com.example.CRUD.Repository.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	 ProductRepo productrepo;

	@Override
	public List<Product> listAllProducts() {

		return productrepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		/*
		 * Optional<Product> optional=productrepo.findById(id); Product product=null; if
		 * (optional.isPresent()) { product = optional.get(); } else { throw new
		 * RuntimeException(" Product not found for id :: " + id); }
		 * 
		 * return product;
		 */
		return productrepo.findById(id).orElse(new Product());
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		productrepo.deleteById(id);

	}

}
