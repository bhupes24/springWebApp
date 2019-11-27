package com.bhupesh.springWebApp.Repository;

import com.bhupesh.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
