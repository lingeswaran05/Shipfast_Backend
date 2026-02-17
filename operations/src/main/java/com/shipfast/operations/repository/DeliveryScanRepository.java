package com.shipfast.operations.repository;

import com.shipfast.operations.entity.DeliveryScan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DeliveryScanRepository extends MongoRepository<DeliveryScan, String> {

    List<DeliveryScan> findByShipmentId(String shipmentId);
}
