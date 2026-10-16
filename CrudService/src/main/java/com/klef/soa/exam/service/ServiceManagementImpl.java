package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Laundry;
import com.klef.soa.exam.repository.ServiceRepository;

@Service
public class ServiceManagementImpl implements ServiceManagement {

    @Autowired
    private ServiceRepository repository;

    @Override
    public Laundry addService(Laundry service) {
        return repository.save(service);
    }

    @Override
    public List<Laundry> displayAll() {
        return repository.findAll();
    }

    @Override
    public void deleteService(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Service not found with id: " + id);
        }

        repository.deleteById(id);
    }
}
