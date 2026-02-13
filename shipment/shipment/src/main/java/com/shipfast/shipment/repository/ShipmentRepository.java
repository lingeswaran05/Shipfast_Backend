package com.shipfast.shipment.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.shipfast.shipment.entity.Shipment;

@Repository
public interface ShipmentRepository extends MongoRepository<Shipment,String>{
	Optional<Shipment> findByShipmentId(Long shipmentId);
	Long deleteShipmentById(Long shipmentId);

}

