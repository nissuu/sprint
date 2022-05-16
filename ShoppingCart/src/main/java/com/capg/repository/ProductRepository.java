package com.capg.repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>
    {

	}
