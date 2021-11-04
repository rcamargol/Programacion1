package co.edu.unbosque.ciclo4amongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.ciclo4amongo.exception.ResourceNotFoundException;
import co.edu.unbosque.ciclo4amongo.model.Author;
import co.edu.unbosque.ciclo4amongo.repository.AuthorRepository;

@Service
@Transactional
public class AuthorService {


    @Autowired
    private AuthorRepository authorRepository;


    public Author createauthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateauthor(Author author) {
        Optional < Author > authorDb = this.authorRepository.findById(author.getId());

        if (authorDb.isPresent()) {
            Author authorUpdate = authorDb.get();
            authorUpdate.setId(author.getId());
            authorUpdate.setAuthorName(author.getAuthorName());
            authorUpdate.setCountry(author.getCountry());
            authorRepository.save(authorUpdate);
            return authorUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + author.getId());
        }
    }

    public List < Author > getAllauthor() {
        return this.authorRepository.findAll();
    }

    public Author getauthorById(long authorId) {

        Optional < Author > authorDb = this.authorRepository.findById(authorId);

        if (authorDb.isPresent()) {
            return authorDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + authorId);
        }
    }

    public void deleteauthor(long authorId) {
        Optional < Author > authorDb = this.authorRepository.findById(authorId);

        if (authorDb.isPresent()) {
            this.authorRepository.delete(authorDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + authorId);
        }

    }
}