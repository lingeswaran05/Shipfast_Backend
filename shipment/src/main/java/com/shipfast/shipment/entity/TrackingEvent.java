package com.shipfast.shipment.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shipfast.shipment.entity.enums.Shipmentstatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tracking_events")
public class TrackingEvent {

    @Id
    private String id;

    private Long shipmentId;

    private Shipmentstatus status;

    private String location;

    private String remarks;

    private LocalDateTime timestamp;

}