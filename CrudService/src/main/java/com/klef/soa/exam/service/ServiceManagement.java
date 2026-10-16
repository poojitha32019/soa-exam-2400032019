package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.Laundry;

public interface ServiceManagement {

    Laundry addService(Laundry service);

    List<Laundry> displayAll();

    void deleteService(Long id);
}