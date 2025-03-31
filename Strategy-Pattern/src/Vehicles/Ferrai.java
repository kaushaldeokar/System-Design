package Vehicles;

import DriveStrategy.SportsDrive;

public class Ferrai extends Vehicle{

    public Ferrai(){
        super(new SportsDrive());
    }
}
