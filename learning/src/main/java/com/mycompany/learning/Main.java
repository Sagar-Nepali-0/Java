/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.learning;
/**
 *
 * @author sagar nepali
 */

public class Main {

    static void carFunction(){
        Car car1 = new Car("Rolls Royce", "Rolls-Royce Boat Tail", 2022, "Blue", 28000000, false);
        Car car2 = new Car("Toyota", "Camry", 2022, "Black", 30000, true);
        car1.carDetails();
        car2.carDetails();
        System.out.println();
        car2.start();
       }


    public static void main(String[] args) {
        carFunction();
    }
}
