/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learning;
/**
 *
 * @author sagar
 */
import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    
    String company = "Rolls Royce";
    String model = "Rolls-Royce Boat Tail";
    int year = 2022;
    String color = "Blue";
    double price = 28000000;
    boolean isRunning = false;
    
    void carDetails(){
        System.out.println("Car Detail\n\nCompany: "+company+"\nModel: "+model+"\n"
                + "Year: "+ year+"\nColor: "+color +"\nPrice: "+ "$"+price);
    }
    
    public void start(){
        if (isRunning == false){
            System.out.println("Engine is off, Can't start the car.");
            System.out.println("To start engine type 'true': ");
            String carengine = scanner.nextLine();
            
            if(carengine.equalsIgnoreCase("true") || carengine.equalsIgnoreCase("false")){
                boolean engine = Boolean.parseBoolean(carengine);
                if (engine){
                System.out.println("Rrrr... Vroom!\nCar engine started.");
                }
                else if(engine == false){
                    System.out.println("Engine is off, Can't start the car.");
                }
           }
            else{
                System.out.println("Can only be 'true' or 'false'.");
            }
            
        }
        else{
            System.out.println("Rrrr... Vroom!\nCar engine started.");
        }
    }
    
    
    
}
