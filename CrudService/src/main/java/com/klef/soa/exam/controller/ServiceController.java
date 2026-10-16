package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.Laundry;
import com.klef.soa.exam.service.ServiceManagement;

@RestController
public class ServiceController {

    @Autowired
    private ServiceManagement service;

    @GetMapping("/")
    public String home() {
        return "Laundry Service is running";
    }

    @PostMapping("/Add")
    public Laundry addService(@RequestBody Laundry item) {
        return service.addService(item);
    }

    @GetMapping("/DisplayAll")
    public List<Laundry> displayAll() {
        return service.displayAll();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteService(@PathVariable Long id) {
        service.deleteService(id);
        return "Service deleted successfully";
    }
}
