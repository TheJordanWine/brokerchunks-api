package com.drchunks.brokerchunks.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:3000")
public interface TransactionRepository extends MongoRepository<Transaction, String> {

    List<Transaction> findByStore(@Param("store") String store);

}
