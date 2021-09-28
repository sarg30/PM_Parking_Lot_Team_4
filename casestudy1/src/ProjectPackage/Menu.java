package ProjectPackage;
import java.text.ParseException;
import java.util.*;
public class Menu extends Customer implements ParkingSlot {
    public static Payment payment=new Payment();
    static ArrayList<Customer> customerList = new ArrayList<>();
    static Slots[] floors=new Slots[obj.NumberOfFloors];
    static Scanner scan=new Scanner(System.in);
    public static void showMenu(){
        System.out.println("Please choose number corresponding to the task to be performed: ");
        System.out.println("1. New Customer  2. an existing customer 3. Exit program");
        int input=scan.nextInt();
        if(input==2)ExistingCustomer();
        else if(input==3){
            System.out.println("Terminating program.....");
            System.exit(0);
        }
        else NewCustomer();

    }
    public static void NewCustomer(){
        Customer customer = new Customer();
        customerList.add(customer);
        showFunction(customerList.size());
    }

    public static void ExistingCustomer(){
        System.out.println("Enter Username");
        String name = scan.next();
        int i;
        for (i = 0; i <customerList.size(); i++) {
            if (name.equals(customerList.get(i).getCustomerName())) {
                showFunction(i);
                break;
            }
        }
        if (i == customerList.size()) {
                System.out.println("User does not exist. Add a new one:");
                Customer customer = new Customer();
                customerList.add(customer);
                showFunction(i);
        }
    }

    public static void showFunction(int i) {
        
        if(customerList.get(i).getparkStatus()==true){
            customerList.get(i).setExitTime();
            System.out.println("Payment Process........");
            try {
                payment.Calling_Payment(customerList.get(i));
                if(customerList.get(i).getparkStatus()==false)customerList.remove(i);
            } catch (ParseException e) {
                System.out.println("Exception menu-showfunction");
                showMenu();
            }
        }
        else {
            System.out.println("Choose the number corresponding to the function you want to perform: ");
            System.out.println("Display Vacancies and set parking");
            //displayVacantfloor(i);
            choosefloorslot(i);
            showMenu();
        }
    }
    //work if time is availabe
    public static void displayVacantfloor(int i){
        System.out.println("Displaying vacancant floors for the fuel type "+customerList.get(i).getFuelTypestr()+" and vehicle type "+customerList.get(i).getVehicleType());
        int fuel=customerList.get(i).getFuelType();
        int vehicle=customerList.get(i).getVehicleType();
        if(fuel==1){
            if(vehicle==1){
                
            }
        }
    }

    public static void choosefloorslot(int i){
        int floor=0,slotnum=0;
        System.out.println("Total floors including ground: "+obj.NumberOfFloors);
        System.out.println("choose from 0 to "+((obj.NumberOfFloors)-1));
        floor=scan.nextInt();
        customerList.get(i).setFloor(floor);
        System.out.println("choose slot: ");
        slotnum=scan.nextInt();
        customerList.get(i).setSlot(slotnum);
        System.out.println("Parking done");
        customerList.get(i).setEntryTime();
    }
}
