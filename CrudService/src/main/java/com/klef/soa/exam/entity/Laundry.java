
package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laundry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private boolean pickupAvailable;
    private double pricePerKg;
    private int deliveryDays;

    public Laundry() {
    }

    public Laundry(Long id, String serviceName, boolean pickupAvailable,
                   double pricePerKg, int deliveryDays) {
        this.id = id;
        this.serviceName = serviceName;
        this.pickupAvailable = pickupAvailable;
        this.pricePerKg = pricePerKg;
        this.deliveryDays = deliveryDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isPickupAvailable() {
        return pickupAvailable;
    }

    public void setPickupAvailable(boolean pickupAvailable) {
        this.pickupAvailable = pickupAvailable;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(int deliveryDays) {
        this.deliveryDays = deliveryDays;
    }
}