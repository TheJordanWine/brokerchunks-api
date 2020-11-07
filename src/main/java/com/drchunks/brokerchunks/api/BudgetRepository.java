package com.drchunks.brokerchunks.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "budgets", path = "budgets")
@CrossOrigin(origins = "http://localhost:3000")
public interface BudgetRepository extends MongoRepository<Budget, String> {

}
