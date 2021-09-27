package ProjectPackage;

import java.util.Scanner;

public class Manager {
    int NumberOfFloors;
    // int NumberOfPSlots;
    int sbike,struck,sscoter,sbus,svan,shandicapped,sElectricCar,sElectricBike; // These will store number of slots per floor 
    // of that particular type.
    
    double charge1a, charge1b, charge1c; // for Motorcycles and Handicapped
    double charge2a, charge2b, charge2c; // for Compact Vehicles
    double charge3a, charge3b, charge3c; // for Large Vehicles
    // a==> for first hour
    // b==> for second hour
    // c==> for further hours

    double chargeElectric;

    Scanner sc = new Scanner(System.in);

    public void GetFoorsAndSlotQuantity() 
    {
        System.out.println("Please enter the number of Floors");
        NumberOfFloors = sc.nextInt();
        System.out.println("Information of Slots per floor");

        System.out.println("Please enter the number of Parking Slots for Bike");
        sbike = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Truck");
        struck = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Scoter");
        sscoter = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Bus");
        sbus = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Van");
        svan = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Handicapped");
        shandicapped = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Electric car");
        sElectricCar = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for Electric Bike");
        sElectricBike = sc.nextInt();

    }

    public void GetCharges() {
        System.out.println("Please enter the Charge for Parking Mortorcycles and Handicapped");
        charge1a = sc.nextDouble();
        charge1b = charge1a/2;
        charge1c = charge1b/2;

        System.out.println("Please enter the Charge for Compact Vehicles");
        charge2a = sc.nextDouble();
        charge2b = charge2a/2;
        charge2c = charge2b/2;

        System.out.println("Please enter the Charge for Parking Mortorcycles and Handicapped");
        charge3a = sc.nextDouble();
        charge3b = charge3a/2;
        charge3c = charge3b/2;

        System.out.println("Please enter the Charge per hour for Charging");
        chargeElectric = sc.nextDouble();
    }

}
/*
Motorcycle (Bike, Scooter)
Compact - (Car,Van, etc)
Large (Trucks, Buses)
Handicapped 
Electric(facility to charge vehicles and pay fees, car or bike)
The user provides charging time, and the corresponding price will be displayed on the screen*/