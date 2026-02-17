package com.shipfast.shipment.repository;

import com.shipfast.shipment.entity.PricingSlab;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PricingSlabRepository
        extends MongoRepository<PricingSlab, String> {

    Optional<PricingSlab> findByWeightFromLessThanEqualAndWeightToGreaterThanEqual(double w1, double w2);
}
