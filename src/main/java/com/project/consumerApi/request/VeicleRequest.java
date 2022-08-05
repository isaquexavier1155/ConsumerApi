package com.project.consumerApi.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VeicleRequest {

    private String title;
    private String brand;
    private String price;
    private Integer age;
    private Integer __v;


}
