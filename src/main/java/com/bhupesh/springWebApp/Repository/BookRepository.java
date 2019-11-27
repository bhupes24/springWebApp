package com.bhupesh.springWebApp.Repository;

import com.bhupesh.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
