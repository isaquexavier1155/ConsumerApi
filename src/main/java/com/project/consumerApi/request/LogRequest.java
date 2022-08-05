package com.project.consumerApi.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogRequest {

    private String id;
    private LocalDate data_hora;
    private String car_id;

}
