package com.shipfast.shipment.service.impl;

import com.shipfast.shipment.entity.enums.ZoneType;
import com.shipfast.shipment.repository.ZoneMappingRepository;
import com.shipfast.shipment.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneServiceImpl implements ZoneService {

    @Autowired
    private ZoneMappingRepository zoneRepository;

    @Override
    public ZoneType determineZone(String fromPincode, String toPincode) {

        return zoneRepository
                .findByFromPincodeAndToPincode(fromPincode, toPincode)
                .orElseThrow(() ->
                        new RuntimeException("Zone not configured"))
                .getZoneType();
    }
}