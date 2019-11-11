package com.company.garage;

import java.util.List;

public class GroundFloor extends Garage {
    public static void getSpaces(List<Space> groundSpaces) {
        Integer size = 15;
        String floorName = "Ground";
        createSpaces(groundSpaces, size, floorName);
    }
}
