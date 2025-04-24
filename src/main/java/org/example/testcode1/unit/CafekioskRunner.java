package org.example.testcode1.unit;

import org.example.testcode1.unit.beverage.Americano;
import org.example.testcode1.unit.beverage.Latte;

import java.util.ArrayList;

public class CafekioskRunner {
    public static void main(String[] args) {
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());
        System.out.println("아메리카노 추가");
        cafeKiosk.add(new Latte());
        System.out.println("라뗴 추가");

        int totalPrice = cafeKiosk.calculateTotalPrice();
        System.out.println(totalPrice);

    }
}
