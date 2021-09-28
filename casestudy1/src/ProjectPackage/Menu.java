package ProjectPackage;
import java.text.ParseException;
import java.util.*;
public class Menu extends Customer implements Parking_Slot {
    public static Payment payment=new Payment();
    static ArrayList<Customer> customerList = new ArrayList<>();
    static Slots[] floors;
    public static void MenuInit (){
        floors=new Slots[obj.NumberOfFloors];
        for(int i=0;i<obj.NumberOfFloors;i++){
        floors[i]=new Slots();
        }
    }
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
        showFunction(customerList.size()-1);
    }

    public static void ExistingCustomer(){
        System.out.println("Enter Username");
        String name = scan.next().trim();
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
                if(customerList.get(i).getparkStatus()==false){
                    vacatingslots(customerList.get(i).getFuelType(),customerList.get(i).getVehicleType(),customerList.get(i).getFloor(),customerList.get(i).getSlot());
                    customerList.remove(i);
                }
            } catch (ParseException e) {
                System.out.println("Exception menu-showfunction");
                showMenu();
            }
            showMenu();
        }
        else {
            System.out.println("Choose the number corresponding to the function you want to perform: ");
            System.out.println("Display Vacancies and set parking");
            choosefloorslot(i);
            showMenu();
        }
    }
    //work if time is availabe
    public static void Vacantfloor(int i,int f){
        //System.out.println("Displaying vacancant floors for the fuel type "+customerList.get(i).getFuelTypestr()+" and vehicle type "+customerList.get(i).getVehicleType());
        int fuel=customerList.get(i).getFuelType();
        int vehicle=customerList.get(i).getVehicleType();
        if(fuel==1){
            if(vehicle==1){
                customerList.get(i).setSlot(floors[f].ehandi());
            }
            else if(vehicle==2){
                customerList.get(i).setSlot(floors[f].emotor());
            }
            else if(vehicle==3){
                customerList.get(i).setSlot(floors[f].ecom());
            }
            else {
                customerList.get(i).setSlot(floors[f].elar());
            }
        }
        else {
            if(vehicle==1){
                customerList.get(i).setSlot(floors[f].handi());
            }
            else if(vehicle==2){
                customerList.get(i).setSlot(floors[f].motor());
            }
            else if(vehicle==3){
                customerList.get(i).setSlot(floors[f].com());
            }
            else {
                customerList.get(i).setSlot(floors[f].lar());
            }
        }
        if(customerList.get(i).getSlot()==-1){
            System.out.println("The floor "+f+" is filled.");
            choosefloorslot(i);
        }

    }

    public static void choosefloorslot(int i){
        int floor=0;
        System.out.println("Total floors including ground: "+obj.NumberOfFloors);
        System.out.println("choose from 0 to "+((obj.NumberOfFloors)-1));
        floor=scan.nextInt();
        if(floor>=obj.NumberOfFloors){
            System.out.println("exceeded max floor count. so, floor will be set to "+((obj.NumberOfFloors)-1));
            floor=((obj.NumberOfFloors)-1);
        }
        System.out.println("chosen floor: "+floor);
        Vacantfloor(i,floor);
        customerList.get(i).setFloor(floor);
        customerList.get(i).setparkStatus(true);
        System.out.println("Parking done");
        customerList.get(i).setEntryTime();
        //showMenu();
    }

    public static void vacatingslots(int fuel,int vehicle,int f,int s){
        if(fuel==1){
            if(vehicle==1){
                floors[f].removeEhandi(s);
            }
            else if(vehicle==2){
                floors[f].removeEmotor(s);
            }
            else if(vehicle==3){
                floors[f].removeEcom(s);
            }
            else {
                floors[f].removeElar(s);
            }
        }
        else {
            if(vehicle==1){
                floors[f].removehandi(s);
            }
            else if(vehicle==2){
                floors[f].removemotor(s);
            }
            else if(vehicle==3){
                floors[f].removecom(s);
            }
            else {
                floors[f].removelar(s);
            }
        }
    }
}
