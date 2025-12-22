package com.tnsif.interfacedemo;

interface Vehicle {
    public void car();
    public void engine();
}

class Car implements Vehicle {

    
    public void car() {
        System.out.println("Car is running");
    }

    public void engine() {
        System.out.println("Print motor");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.car();
        myCar.engine();
    }
}

