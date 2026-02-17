package com.shipfast.shipment.service;

import com.shipfast.shipment.entity.enums.ZoneType;

public interface ZoneService {
    ZoneType determineZone(String fromPincode, String toPincode);

}
