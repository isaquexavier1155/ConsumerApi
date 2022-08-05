package com.project.consumerApi.client;

import com.project.consumerApi.model.Veicle;
import com.project.consumerApi.request.VeicleRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "post", url = "http://api-test.bhut.com.br:3000/api/cars")

public interface CreateVeicleClient {

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    Veicle createVeicle(VeicleRequest veicleRequest);

}
