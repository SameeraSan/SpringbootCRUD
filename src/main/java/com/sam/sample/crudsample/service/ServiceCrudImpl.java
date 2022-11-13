package com.sam.sample.crudsample.service;

import com.sam.sample.crudsample.ResourceEntity;
import com.sam.sample.crudsample.dto.RequestDto;
import com.sam.sample.crudsample.dto.ResponseDto;
import com.sam.sample.crudsample.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCrudImpl implements ServiceCRUD{

    CrudRepository crudRepository;

    @Autowired
    public ServiceCrudImpl(CrudRepository crudRepository){
        this.crudRepository = crudRepository;
    }

    @Override
    public ResponseDto readResource(long id) {

        ResponseDto response = new ResponseDto();
        response.setMessage("Response for id : "+id);
        response.setResource(crudRepository.findFirstById(id));

        return response;
    }

    @Override
    public ResponseDto readResource() {

        ResponseDto response = new ResponseDto();
        response.setMessage("Load all Responses");
        response.setResourceList(crudRepository.findAllBy());

        return response;
    }

    @Override
    public ResponseDto createResource(RequestDto request) {
        ResourceEntity entity = new ResourceEntity();
        entity.setId(request.getId());
        entity.setName(request.getName());
        entity.setAge(request.getAge());

        crudRepository.save(entity);

        return new ResponseDto("Resource created, id : "+request.getId(),null,null);
    }

    @Override
    public ResponseDto updateResource(RequestDto request) {
        ResponseDto response = new ResponseDto();
        int result = crudRepository.updateResource(request.getName(), request.getId());

        if(result > 0){
            response.setMessage("Resource updated");
        } else {
            response.setMessage("No resource updated");
        }

        return response;
    }

    @Override
    public ResponseDto deleteResource(RequestDto request) {
        ResponseDto response = new ResponseDto();
        crudRepository.deleteById(request.getId());
        response.setMessage("Resource deleted");

        return response;
    }
}
