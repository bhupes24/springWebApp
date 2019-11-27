package com.bhupesh.springWebApp.Repository;

import com.bhupesh.springWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
