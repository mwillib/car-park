package com.company.garage;

import java.util.List;

public class SecondFloor extends Garage {
    public static void getSpaces(List<Space> secondSpaces) {
        Integer size = 30;
        String floorName = "Second";
        createSpaces(secondSpaces, size, floorName);
    }
}
