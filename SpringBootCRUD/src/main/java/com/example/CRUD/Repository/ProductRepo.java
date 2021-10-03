package com.example.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	

}
