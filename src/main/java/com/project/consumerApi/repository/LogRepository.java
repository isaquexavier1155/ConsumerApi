package com.project.consumerApi.repository;

import com.project.consumerApi.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {

}
