package Vehicles;

import DriveStrategy.NormalDrive;

public class Nano extends Vehicle{

    public Nano(){
        super(new NormalDrive());
    }
}
