package com.shipfast.shipment.service;

import com.shipfast.shipment.entity.enums.Servicetype;

public interface RateCalculationService {

    double calculatePrice(double weightKg, double lengthCm, double widthCm, double heightCm, Servicetype servicetype);
}
