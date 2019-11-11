package com.company;

import com.company.garage.FirstFloor;
import com.company.garage.GroundFloor;
import com.company.garage.SecondFloor;
import com.company.garage.Space;
import com.company.vehicles.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Space> allSpaces = new ArrayList<>();
        createSpaces(allSpaces);

        List<Vehicle> vehicles = new ArrayList<>();
        createVehicles(vehicles);

    }

    public static void createSpaces(List<Space> allSpaces){
        ArrayList<Space> groundSpaces = new ArrayList<>();
        ArrayList<Space> firstSpaces = new ArrayList<>();
        ArrayList<Space> secondSpaces = new ArrayList<>();

        GroundFloor.getSpaces(groundSpaces);
        FirstFloor.getSpaces(firstSpaces);
        SecondFloor.getSpaces(secondSpaces);

        allSpaces.addAll(groundSpaces);
        allSpaces.addAll(firstSpaces);
        allSpaces.addAll(secondSpaces);

    }

    public static void createVehicles(List<Vehicle> vehicles) {
        List<LargeVehicle> largeVehicles = Arrays.asList(
                new Van("KI89JDU"),
                new Van("HU76UIH")
        );
        List<SmallVehicle> smallVehicles = Arrays.asList(
                new Car("BH67HGU"),
                new Bike("PT42FGX"),
                new Car("XG63BTG")
        );
        vehicles.addAll(largeVehicles);
        vehicles.addAll(smallVehicles);
    }
}
