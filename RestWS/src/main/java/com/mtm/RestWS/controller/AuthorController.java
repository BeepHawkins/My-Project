package com.mtm.RestWS.controller;

import com.mtm.RestWS.model.Author;
import com.mtm.RestWS.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    private Logger logger = LoggerFactory.getLogger(AuthorController.class);

    @GetMapping("/author")
    public List<Author> getAuthorList() {
        logger.info("getAuthorList");
        return authorService.getAuthorList();
    }

    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author authorToCreate) {
        logger.info("createAuthor");
        return authorService.saveAuthor(authorToCreate);
    }
}
