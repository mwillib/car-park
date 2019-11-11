package com.company.garage;

import java.util.List;

public class FirstFloor extends Garage {
    public static void getSpaces(List<Space> firstSpaces) {
        Integer size = 30;
        String floorName = "First";
        createSpaces(firstSpaces, size, floorName);
    }
}
