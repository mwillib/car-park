package com.company.garage;

import java.util.List;

public class Garage {
    public static void createSpaces(List<Space> firstSpaces, Integer size, String floorName) {
        for (int i = 1; i <= size; i++) {
            Space space = new Space(floorName, i);
            firstSpaces.add(space);
        }
    }
}
