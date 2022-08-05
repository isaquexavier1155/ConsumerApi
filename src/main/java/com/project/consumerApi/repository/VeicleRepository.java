package com.project.consumerApi.repository;

import com.project.consumerApi.model.Veicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeicleRepository extends MongoRepository<Veicle, String> {

}
