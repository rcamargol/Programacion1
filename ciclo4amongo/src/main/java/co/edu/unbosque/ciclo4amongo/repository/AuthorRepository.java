package co.edu.unbosque.ciclo4amongo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.ciclo4amongo.model.Author;

public interface AuthorRepository extends MongoRepository < Author, Long > {

}