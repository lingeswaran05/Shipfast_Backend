package com.shipfast.shipment.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipfast.shipment.entity.Shipment;
import com.shipfast.shipment.repository.ShipmentRepository;
import com.shipfast.shipment.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public Shipment createShipment(Shipment shipment) {

        if (shipment.getBookingDate() == null) {
            shipment.setBookingDate(LocalDate.now());
        }

        return shipmentRepository.save(shipment);
    }

    @Override
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    @Override
    public Shipment getShipmentById(Long shipmentId) {
        return shipmentRepository.findByShipmentId(shipmentId).orElseThrow(() -> new RuntimeException("Shipment not found"));
             
    }

    @Override
    public Long  deleteByShipmentId(Long id){
    	shipmentRepository.deleteShipmentById(id);
    	return id;
    }
}
