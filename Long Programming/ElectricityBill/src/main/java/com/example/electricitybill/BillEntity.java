package com.example.electricitybill;

import jakarta.persistence.*;
import lombok.*;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@jakarta.persistence.Entity
@Table(name = "electricity_bills")
public class BillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String meterNumber;
    private int previousReading;
    private int currentReading;
    private int unitsConsumed;
    private double ratePerUnit;
    private double totalAmount;
    private String billMonth;
    private String status;
}