import Vehicles.Ferrai;
import Vehicles.Nano;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle ferrariV1 = new Ferrai();
        System.out.println(ferrariV1.drive() + " for : "+ferrariV1);

        Vehicle nanoV1 = new Nano();
        System.out.println(nanoV1.drive()+ " for : "+nanoV1);


    }
}