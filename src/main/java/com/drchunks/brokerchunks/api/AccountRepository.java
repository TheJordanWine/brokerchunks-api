package com.drchunks.brokerchunks.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.security.access.prepost.PreAuthorize;

// @PreAuthorize()
@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts")
@CrossOrigin(origins = "http://localhost:3000")
public interface AccountRepository extends MongoRepository<Account, String> {

}
