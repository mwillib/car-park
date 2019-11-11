package com.company.vehicles;

public class Car extends AbstractVehicle implements SmallVehicle, canFitLarge, canFitSmall{

    public Car(String reg){super(reg);}
}
