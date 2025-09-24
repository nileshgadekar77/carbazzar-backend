package com.carbazzar.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars_details")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin;
    private String registrationNumber;
    private String chassisNumber;
    private String engineNumber;

    private String make;
    private String model;
    private String variant;
    private int yearOfManufacture;
    private String fuelType;
    private String transmission;
    private String bodyType;
    private String color;

    private int engineCapacity;   // in cc
    private int horsePower;
    private int torque;
    private int seatingCapacity;
    private double mileage;       // km/l
    private long odometerReading;
    private Double batteryCapacity; // for EVs

    private String ownerType;
    private String rcStatus;
    private String insuranceStatus;
    private LocalDate insuranceExpiryDate;
    private LocalDate pollutionCertificateExpiry;
    private boolean serviceHistoryAvailable;

    private String overallCondition;
    private boolean accidentHistory;
    private boolean floodDamage;
    private LocalDate lastServiceDate;
    private String inspectionReportId; // reference

    private double currentMarketValue;
    private double listedPrice;
    private double minNegotiablePrice;
    private double depreciationRate;

    private String status; // Available, Sold, etc.
    private LocalDate dateAdded;
    private LocalDate dateSold;
    private String scrapStatus;

    @ElementCollection
    private List<String> photos;

    @ElementCollection
    private List<String> features;

    @ElementCollection
    private List<String> accessories;

  
}
