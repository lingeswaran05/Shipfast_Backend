package com.shipfast.shipment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Document(collection = "pricing_slabs")
public class PricingSlab {

    @Id
    private String id;

    private double weightFrom;
    private double weightTo;

    private double zoneAStandard;
    private double zoneAExpress;
    private double zoneASameDay;

    private double zoneBStandard;
    private double zoneBExpress;
    private double zoneBSameDay;

    private double zoneCStandard;
    private double zoneCExpress;
    private double zoneCSameDay;
}