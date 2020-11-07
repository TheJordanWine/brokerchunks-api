package com.drchunks.brokerchunks.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:3000")
public interface CategoryRepository extends MongoRepository<Category, String> {

}
