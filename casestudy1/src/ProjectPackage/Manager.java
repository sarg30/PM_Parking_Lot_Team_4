package ProjectPackage;
import java.util.Scanner;
interface Parking_Slot {
    Manager obj=new Manager(); 
    //manager object - this is necessary to access the modified values of prices and slot numbers
    // without this object only default values can be accessed
}
class Manager {
    static int NumberOfFloors=3;
    // int NumberOfPSlots;
    static int smotor=4,slarge=4,scompact=4,shandicapped=4,sElectrichandi=4,sElectricmotor=4,selectriccompact=4,selectriclarge=4; // These will store number of slots per floor 
    // of that particular type.
   
    static Scanner sc = new Scanner(System.in);

    static void SetFoorsAndSlotQuantity() 
    {
        System.out.println("Please enter the number of Floors");
        NumberOfFloors = sc.nextInt();
        System.out.println("Information of Slots per floor");
        System.out.println("Please enter the number of Parking Slots for Handicapped");
        shandicapped = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for motorvehicles");
        smotor = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for compact");
        scompact = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for large vehicles");
        slarge = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for electric handicapped vehicles");
        sElectrichandi = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for electric motorvehicles");
        sElectricmotor = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for electric compact vehicles");
        selectriccompact = sc.nextInt();
        System.out.println("Please enter the number of Parking Slots for electric large vehicles");
        selectriclarge = sc.nextInt();
        
    }

    public static void SetCharges(Payment payment) {
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
        payment.settingFee(charge1a,charge2a,charge3a,charge4a,electricityCharge);
    }

}
/*Motorcycle (Bike, Scooter)
Compact - (Car,Van, etc)
Large (Trucks, Buses)
Handicapped 
Electric(facility to charge vehicles and pay fees, car or bike)
The user provides charging time, and the corresponding price will be displayed on the screen
*/