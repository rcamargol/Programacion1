package co.edu.unbosque.ciclo4amongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.ciclo4amongo.model.Product;
//Este es un comentario re chimbo
public interface ProductRepository extends MongoRepository < Product, Long > {

}