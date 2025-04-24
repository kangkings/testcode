package org.example.testcode1.unit;

import org.example.testcode1.unit.beverage.Americano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeKioskTest {

    @Test
    void add(){
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());

        System.out.println(cafeKiosk.getBeverages().size());
        System.out.println(cafeKiosk.getBeverages().get(0).getName());
    }
}