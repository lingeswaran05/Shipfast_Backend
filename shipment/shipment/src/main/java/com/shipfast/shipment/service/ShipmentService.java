package com.shipfast.shipment.service;

import java.util.List;

import com.shipfast.shipment.entity.Shipment;

public interface ShipmentService {

    Shipment createShipment(Shipment shipment);

    List<Shipment> getAllShipments();

    Shipment getShipmentById(Long id);
    
    Long deleteByShipmentId(Long shipmentId);
}
