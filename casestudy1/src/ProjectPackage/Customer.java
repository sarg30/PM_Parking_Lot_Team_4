package ProjectPackage;
import java.util.*;
class Customer extends Payment {
    Scanner scan = new Scanner(System.in);
    private String CustomerName ="";
    private int VehicleType=3; //1- handicapped, 2-motor, 3- compact, 4- large
    private double Balance = 0.0f;
    private int PaymentType=1;//1-cash 2-card 3-UPI(G-pay,phonePay,cred...) 4-fastTag
    private double FastTagBalance=0.0f;
    private int fuelType=2; // 1- electric , 2- diesel
    private int floor_num = 0;
    private int slot_num=0;
    private float bill = 0;
    private String entryTime="";
    private String exitTime="";
    private boolean parkStatus = false;
    String[] vehicle=new String[]{"Handicapped","Motorcycles (Bikes, Scooters etc)","Compact (Cars, Vans, Auto-Rikshaw,etc)","Large (Buses,Trucks, etc)"};
    String[] payTypeStr=new String[]{"cash","card","UPI(G-pay,phonePay,cred...)","Fastag"};
    
    Customer() { // all these are executed as soon as the customer object is created
        setCustomername();
        setVehicleType();
        setFuelType();
        setPaymentType();
        setBalance();
    }

   //  **Basic Customer Details**

    void setCustomername(){ // to set customer name
        System.out.println("Please enter your Username: ");
        CustomerName=scan.nextLine().trim();
        if(CustomerName==""){
            System.out.println("Please Enter a Valid Name. Username should not be empty.");
            setCustomername();;
        }
    }
    void setVehicleType(){ // to set the vehicle type
        System.out.println("1 - Handicapped \n2 - Motorcycles (Bikes, Scooters etc)\n3 - Compact (Cars, Vans, Auto-Rikshaw,etc)\n4 - Large (Buses,Trucks, etc)");
        System.out.println("Enter the respective number corresponding to the Type of Vehicle: ");
        try {
            VehicleType=scan.nextInt();
        } catch (Exception e) {
            System.out.println("Enter only an integer value from 1 to 4 from the given options.");
            setVehicleType();
        }
    }
    void setFuelType(){ // to set the fuel type
        System.out.println("1 - Electric\n2 - Diesel/Petrol/CNG");
        System.out.println("Enter the respective number corresponding to the fuel type: ");
        try{
            fuelType=scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Enter only an integer values 1 or 2 based on the given options.");
            setFuelType();
        }
    }
    void setPaymentType(){ // to set payment type
        System.out.println("1 - Cash \n2 - Card\n3 - UPI(G-pay,phonePay,cred...)\n4 - Fastag");
        System.out.println("Enter the respective number corresponding to the Payment type: ");
        try{
            PaymentType=scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Enter only an integer values from 1 to 4 based on the given options.");
            setPaymentType();
        }
        if(PaymentType==4)setFastTagBalance();
    }
    void setFastTagBalance(){ // to set fastag balance of the customer
        try{
            FastTagBalance=scan.nextDouble();
        }
        catch (Exception e){
            System.out.println("Please enter Valid Fastag balance: ");
            setFastTagBalance();
        }
        
    }
    void setBalance(){ //to get customer's account balance and set balance
        try {
            System.out.println("Enter Account Balance : ");
            if(PaymentType==4)System.out.println("Though fastag is chosen, please enter your account balance for alternative payment features.");
            Balance = scan.nextDouble();
            if (Balance <= 0.0f) {
                System.out.println("Please enter valid balance for further proceedings...");
                setBalance();
            } 
        } catch (Exception e) {
            System.out.println("Enter valid input");
            Balance = 0.0f;
            setBalance();
        }
    }

    //PARKING LOT settings
    public void setFloor(int floor){ 
        floor_num=floor;
    }
    public void setSlot(int slot){
        slot_num=slot;
    }
    public void setparkStatus(boolean status){
        parkStatus=status;
    }
    public void setEntryTime(){
        entryTime=Timer_Class.Date_Time();
    }
    public void setExitTime(){
        exitTime=Timer_Class.Date_Time();
    }
    //                -------   **getter methods to access data elements**   -------

    public String getCustomerName() {//returns customer name as string
        return CustomerName;
    }
    public double getBalance() { //returns customer account balance
        return Balance;
    }
    public int getFuelType(){ //returns fuel type of customer as integer 1- electric , 2 - diesel
        return fuelType;
    }
    public int getVehicleType() { //returns vehicle type as an integer 1-hanicapped, 2-motorcycles, 3-compact, 4-large
        return VehicleType;
    }
    public String getVehicleType_str(){ // returns vehicle type as a string
        return vehicle[VehicleType-1];
    }
    public String getPaymentType_str(){ // returns payment type as a string
        return payTypeStr[PaymentType-1];
    }
    public double getFastagBalance(){
        return FastTagBalance;
    }
    public int getFloor(){ //to get floor number
        return floor_num;
    }
    public int getSlot(){ // to get slot number
        return slot_num;
    }
    public boolean getparkStatus(){ //returns whether the vehicle is parked or not
       return  parkStatus;
    }
}
