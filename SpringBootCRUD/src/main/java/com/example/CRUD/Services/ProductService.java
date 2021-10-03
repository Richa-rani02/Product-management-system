package com.example.CRUD.Services;

import java.util.List;
import java.util.Optional;

import com.example.CRUD.Model.Product;

public interface ProductService {

	 List<Product> listAllProducts();

	    Product getProductById(Integer id);

	    Product saveProduct(Product product);

	    void deleteProduct(Integer id);
}
