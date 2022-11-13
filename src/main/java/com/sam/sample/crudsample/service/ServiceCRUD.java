package com.sam.sample.crudsample.service;

import com.sam.sample.crudsample.dto.RequestDto;
import com.sam.sample.crudsample.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface ServiceCRUD {

    ResponseDto readResource(long id);

    ResponseDto readResource();

    ResponseDto createResource(RequestDto request);

    ResponseDto updateResource(RequestDto request);

    ResponseDto deleteResource(RequestDto request);

}
