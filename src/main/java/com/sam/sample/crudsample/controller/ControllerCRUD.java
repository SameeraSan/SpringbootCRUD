package com.sam.sample.crudsample.controller;

import com.sam.sample.crudsample.dto.RequestDto;
import com.sam.sample.crudsample.dto.ResponseDto;
import com.sam.sample.crudsample.service.ServiceCRUD;
import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@Validated
@RestController
@RequestMapping("/v1/crud")
public class ControllerCRUD {

    ServiceCRUD serviceCRUD;

    @Autowired
    public ControllerCRUD(ServiceCRUD serviceCRUD) {
        this.serviceCRUD = serviceCRUD;
    }

    @GetMapping(path= "/read/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> readResource(@PathVariable long id) {
        log.info("Read Service");
        ResponseDto response = serviceCRUD.readResource(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path= "/read", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> readResource() {
        log.info("Read Service");
        ResponseDto response = serviceCRUD.readResource();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> createResource(@Valid @NotNull @RequestBody RequestDto request) throws Exception {
        log.info("Create Service");
        ResponseDto response = serviceCRUD.createResource(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> updateResource(@Valid @NotNull @RequestBody RequestDto request) throws Exception {
        log.info("Update Service");
        ResponseDto response = serviceCRUD.updateResource(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping (value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> deleteResource(@Valid @NotNull @RequestBody RequestDto request) throws Exception {
        log.info("Delete Service");
        ResponseDto response = serviceCRUD.deleteResource(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
