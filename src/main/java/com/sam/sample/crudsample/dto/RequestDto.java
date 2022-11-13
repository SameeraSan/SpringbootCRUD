package com.sam.sample.crudsample.dto;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class RequestDto {

    @Min(value=1, message="Id cannot be empty or 0")
    private long id;
    private String name;
    private int age;
}
