package com.capg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Product;
import com.capg.exception.ResourceNotFoundException;
import com.capg.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<Product>();
		productRepository.findAll().forEach(order1 -> list.add(order1));
		return list;
	}

	@Override
	public Product getProductById(Long productId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		if (productRepository.findById(productId).isPresent()) {
			Product product = productRepository.findById(productId).get();
			return product;
		} else {

			throw new ResourceNotFoundException("Product with Id" + productId + "doesn't exist");
		}

	}

	public void updateProduct(Product product) throws ResourceNotFoundException {

		if (productRepository.findById(product.getProductId()).isPresent()) {
			// TODO Auto-generated method stub
			productRepository.save(product);
		} else {
			throw new ResourceNotFoundException("Product with Id" + product + "doesn't exist");
		}

	}
}
