package Vehicles;

import DriveStrategy.DriveStrategy;

public class Vehicle{

    private final DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObject){
        this.driveObject=driveObject;
    }

    public String drive(){
        return driveObject.drive();
    }
}
