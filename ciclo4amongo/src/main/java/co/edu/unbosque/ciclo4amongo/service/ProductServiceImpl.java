package co.edu.unbosque.ciclo4amongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.ciclo4amongo.exception.ResourceNotFoundException;
import co.edu.unbosque.ciclo4amongo.model.Product;
import co.edu.unbosque.ciclo4amongo.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl {


    @Autowired
    private ProductRepository productRepository;


    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        Optional < Product > productDb = this.productRepository.findById((int) product.getId());

        if (productDb.isPresent()) {
            Product productUpdate = productDb.get();
            productUpdate.setId(product.getId());
            productUpdate.setName(product.getName());
            productUpdate.setDescription(product.getDescription());
            productRepository.save(productUpdate);
            return productUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + product.getId());
        }
    }

    public List < Product > getAllProduct() {
        return this.productRepository.findAll();
    }

    public Product getProductById(long productId) {

        Optional < Product > productDb = this.productRepository.findById((int) productId);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }

    public void deleteProduct(long productId) {
        Optional < Product > productDb = this.productRepository.findById((int) productId);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }

    }
}