package com.drchunks.brokerchunks.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
@CrossOrigin(origins = "http://localhost:3000")
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(@Param("name") String name);

    List<User> findByEmail(@Param("email") String email);

}
