package com.sam.sample.crudsample.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sam.sample.crudsample.ResourceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

    private String message;
    private ResourceEntity resource;
    private List<ResourceEntity> resourceList;
}
