package co.edu.unbosque.ciclo4amongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.ciclo4amongo.model.Author;
import co.edu.unbosque.ciclo4amongo.service.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthor() {
        return ResponseEntity.ok().body(authorService.getAllauthor());
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable long id) {
        return ResponseEntity.ok().body(authorService.getauthorById(id));
    }

    @PostMapping("/authors")
    public ResponseEntity < Author > createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok().body(this.authorService.createauthor(author));
    }

    @PutMapping("/authors/{id}")
    public ResponseEntity < Author > updateAuthor(@PathVariable long id, @RequestBody Author author) {
        author.setId(id);
        return ResponseEntity.ok().body(this.authorService.updateauthor(author));
    }

    @DeleteMapping("/authors/{id}")
    public HttpStatus deleteAuthor(@PathVariable long id) {
        this.authorService.deleteauthor(id);
        return HttpStatus.OK;
    }
}