/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learning;
/**
 *
 * @author sagar nepali
 */
import java.util.Scanner;
// Scanner modules is asking input from user.

// This java code show how OOP => Object Oriented Programming Work.
public class Car {
    Scanner scanner = new Scanner(System.in); 
    // Scanner scanner = new Scanner(System.in); it is nothing complicated. Just creating a object and giving a access of Scanner throughout the code.
    String company;
    String model;
    int year;
    String color;
    double price;
    boolean isRunning;

    Car(String company, String model, int year, String color, double price, boolean isRunning){
        // this.variables = variables; IT IS CALLED CONSTRUCTORS. IT REDUCE THE QUANTITY OF CODE DUE TO ITS REUSE ABLE. 
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
    }
    
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
