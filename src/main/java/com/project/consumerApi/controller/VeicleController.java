package com.project.consumerApi.controller;

import com.project.consumerApi.client.CreateVeicleClient;
import com.project.consumerApi.client.VeicleClient;
import com.project.consumerApi.model.Log;
import com.project.consumerApi.model.Veicle;
import com.project.consumerApi.request.LogRequest;
import com.project.consumerApi.request.VeicleRequest;
import com.project.consumerApi.service.VeicleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeicleController {

    @Autowired
    private VeicleClient veicleClient;

    @Autowired
    private VeicleService veicleService;

    @Autowired
    private CreateVeicleClient createVeicleClient;

    public static final Logger LOGGER = LoggerFactory.getLogger(VeicleController.class);

    @GetMapping("api/listCars")
    public List<Veicle> getAllPosts() {
        LOGGER.info("Logging services Started");
        LOGGER.warn("Please check");

        return veicleClient.getAllPosts();
    }

    @PostMapping("api/createCar")
    @ResponseStatus(HttpStatus.CREATED)
    public Veicle createCar(@RequestBody VeicleRequest veicleRequest) {
        LOGGER.info("Log Post Implementado- Log salvo no banco de dados");
        return createVeicleClient.createVeicle(veicleRequest);

    }

    @PostMapping("api/logs")
    public Log logCreateCar(@RequestBody LogRequest veicleLogRequest) {
        LOGGER.info("Log Get Implementado- Log salvo no banco de dados");
        return veicleService.createLog(veicleLogRequest);
    }


}
