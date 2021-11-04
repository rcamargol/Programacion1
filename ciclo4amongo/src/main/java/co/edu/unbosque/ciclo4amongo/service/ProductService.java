package co.edu.unbosque.ciclo4amongo.service;

import java.util.List;

import co.edu.unbosque.ciclo4amongo.model.Product;

public interface ProductService {
	
    Product createProduct(Product product);

    Product updateProduct(Product product);

    List < Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}