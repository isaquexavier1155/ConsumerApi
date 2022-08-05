package com.project.consumerApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)

public class Veicle {

    @Id
    private String _id;
    private String title;
    private String brand;
    private String price;
    private Integer age;
    private Integer __v;


}
