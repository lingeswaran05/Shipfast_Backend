package com.shipfast.shipment.service.impl;

import com.shipfast.shipment.entity.enums.Servicetype;
import org.springframework.stereotype.Service;
import com.shipfast.shipment.service.RateCalculationService;

@Service
public class RateCalculationServiceImpl
        implements RateCalculationService {

    private static final double BASE_RATE_PER_KG = 50.0;

    @Override
    public double calculatePrice(double weightKg,
                                 double lengthCm,
                                 double widthCm,
                                 double heightCm,
                                 Servicetype servicetype) {

        double volumetricWeight =
                (lengthCm * widthCm * heightCm) / 5000.0;

        double finalWeight = Math.max(weightKg, volumetricWeight);

        double basePrice = finalWeight * BASE_RATE_PER_KG;

        return switch (servicetype) {
            case STANDARD -> basePrice;
            case EXPRESS -> basePrice + 80;
            case SAME_DAY -> basePrice + 120;
            default -> throw new RuntimeException("Invalid service type");
        };
    }
}

