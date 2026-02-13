package com.shipfast.shipment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shipfast.shipment.entity.Shipment;
import com.shipfast.shipment.service.ShipmentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private static final Logger log = LoggerFactory.getLogger(ShipmentController.class);

    @Autowired
    private ShipmentService shipmentService;

    @PostMapping
    public Shipment addShipment(@RequestBody Shipment shipment) {
        log.info("Received Shipment: {}", shipment);
        return shipmentService.createShipment(shipment);
    }

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shipment> getShipmentById(@PathVariable Long id) {
    	
        Shipment shipment = shipmentService.getShipmentById(id);
        return ResponseEntity.ok(shipment);
    }
    
    @DeleteMapping("/{id}")
    public void deleteShipmentById(@PathVariable Long id)    {
    	shipmentService.deleteByShipmentId(id);
    }
    
    
    
    
}
