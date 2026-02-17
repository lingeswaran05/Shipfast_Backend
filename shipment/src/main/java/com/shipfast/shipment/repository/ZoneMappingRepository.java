package com.shipfast.shipment.repository;

import com.shipfast.shipment.entity.ZoneMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ZoneMappingRepository extends MongoRepository<ZoneMapping, String> {

    Optional<ZoneMapping> findByFromPincodeAndToPincode(String from, String to);
}
