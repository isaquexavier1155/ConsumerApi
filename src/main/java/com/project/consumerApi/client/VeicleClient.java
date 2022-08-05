package com.project.consumerApi.client;

import com.project.consumerApi.model.Veicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "get", url = "http://api-test.bhut.com.br:3000")
public interface VeicleClient {

    @GetMapping(value = "/api/cars")
    List<Veicle> getAllPosts();
}
