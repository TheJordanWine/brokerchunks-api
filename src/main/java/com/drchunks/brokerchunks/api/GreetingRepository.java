package com.drchunks.brokerchunks.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "greetings", path = "greetings")
@CrossOrigin(origins = "http://localhost:8081")
public interface GreetingRepository extends MongoRepository<Greeting, String> {

    List<Greeting> findByContent(@Param("content") String content);

}
