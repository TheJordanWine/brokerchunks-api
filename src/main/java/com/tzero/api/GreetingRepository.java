package com.brokerchunks.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "greeting", path = "greeting")
public interface GreetingRepository extends MongoRepository<Greeting, String> {

    List<Greeting> findByContent(@Param("content") String content);

}
