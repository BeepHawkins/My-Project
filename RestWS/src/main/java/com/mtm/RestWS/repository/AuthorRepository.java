package com.mtm.RestWS.repository;
import com.mtm.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {

    Author findAuthorByName(String name);
}