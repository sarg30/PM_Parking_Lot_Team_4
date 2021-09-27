package ProjectPackage;
import java.util.Scanner;
import ProjectPackage.*;
public class Manager {
    int NumberOfFloors;
    // int NumberOfPSlots;
    int sbike,struck,sscoter,sbus,svan,shandicapped,sElectricCar,sElectricBike; // These will store number of slots per floor 
    // of that particular type.
    
     
    static Scanner sc = new Scanner(System.in);
    public static Payment pay=new Payment();

    public void SetFoorsAndSlotQuantity() 
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
    }

    public  static void SetCharges() {
        double charge1a; // for Handicapped
        double charge2a; // for motorcycles
        double charge3a; // for compact Vehicles
        double charge4a; //for large
        // a==> for first hour
        // b==> for second hour
        // c==> for further hours
        System.out.println("Please enter the Charges for Parking Vehicles for the Handicapped: ");
        charge1a = sc.nextDouble();

        System.out.println("Please enter the Charges for Parking Mortorcycles: ");
        charge2a = sc.nextDouble();

        System.out.println("Please enter the Charges for Parking Compact Vehicles: ");
        charge3a = sc.nextDouble();

        System.out.println("Please enter the Charges for Parking Large Vehicles: ");
        charge4a = sc.nextDouble();

        System.out.println("Please enter the electricity charge per Hour of usage: ");
        double electricityCharge=sc.nextDouble();
        pay.settingFee(charge1a,charge2a,charge3a,charge4a,electricityCharge);
        

    }

}
/*Motorcycle (Bike, Scooter)
Compact - (Car,Van, etc)
Large (Trucks, Buses)
Handicapped 
Electric(facility to charge vehicles and pay fees, car or bike)
The user provides charging time, and the corresponding price will be displayed on the screen
*/