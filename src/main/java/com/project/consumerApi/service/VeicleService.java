package com.project.consumerApi.service;

import com.project.consumerApi.controller.VeicleController;
import com.project.consumerApi.model.Log;
import com.project.consumerApi.repository.LogRepository;
import com.project.consumerApi.request.LogRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeicleService {

    @Autowired
    private LogRepository logRepository;


    public Log createLog(LogRequest logRequest) {
        Logger LOGGER = LoggerFactory.getLogger(VeicleController.class);
        LOGGER.info("Salvando Log ");
        Log veicleLog = Log.builder()
                .data_hora(logRequest.getData_hora())
                .car_id(logRequest.getCar_id())
                .build();
        return logRepository.save(veicleLog);
    }
}
