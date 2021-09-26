package ProjectPackage;
import java.util.*;
class Customer extends Payment {
    Scanner scan = new Scanner(System.in);
    private String CustomerName ="";
    private int VehicleType=3; //1- handicapped, 2-motor, 3- compact, 4- large
    private double Balance = 0.0f;
    private int PaymentType=1;//1-cash 2-card 3-UPI(G-pay,phonePay,cred...) 4-fastTag
    private double FastTagBalance = 0.0;
    private int fuelType=2; // 1- electric , 2- diesel
    private int floor_no = 0;
    private float bill = 0;
    private String entryTime="";
    private String exitTime="";
    private boolean parkStatus = false;
    String[] vehicle=new String[]{"Handicapped","Motorcycles (Bikes, Scooters etc)","Compact (Cars, Vans, Auto-Rikshaw,etc)","Large (Buses,Trucks, etc)"};
    String[] payTypeStr=new String[]{"cash","card","UPI(G-pay,phonePay,cred...)","Fastag"};
    Customer() {
        setCustomername();
        setVehicleType();
        setFuelType();
        setPaymentType();
        setBalance();
    }
    void setCustomername(){
        System.out.println("Please enter your Username: ");
        CustomerName=scan.nextLine().trim();
        if(CustomerName==""){
            System.out.println("Please Enter a Valid Name. Username should not be empty.");
            setCustomername();;
        }
    }
    void setVehicleType(){
        System.out.println("1 - Handicapped \n2 - Motorcycles (Bikes, Scooters etc)\n3 - Compact (Cars, Vans, Auto-Rikshaw,etc)\n4 - Large (Buses,Trucks, etc)");
        System.out.println("Enter the respective number corresponding to the Type of Vehicle: ");
        try {
            VehicleType=scan.nextInt();
        } catch (Exception e) {
            System.out.println("Enter only an integer value from 1 to 4 from the given options.");
            setVehicleType();
        }
    }
    void setFuelType(){
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
    void setPaymentType(){
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
    void setFastTagBalance(){
        try{
            FastTagBalance=scan.nextDouble();
        }
        catch (Exception e){
            System.out.println("Please enter Valid Fastag balance: ");
            setFastTagBalance();
        }
        
    }
    void setBalance(){
        try {
            System.out.println("Enter Account Balance for Validation of Payment: ");
            Balance = Float.parseFloat(scan.next());
            if (Balance <= 0) {
                System.out.println("Please enter valid balance amount");
                setBalance();
            } else {
                System.out.println("Added : " + Balance);
            }
        } catch (Exception e) {
            System.out.println("Please enter valid input");
            System.out.println("Balance set to 0 OR");
            Balance = 0;
            setBalance();
        }
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public double getBalance() {
        return Balance;
    }
    public int getFuelType(){
        return fuelType;
    }
    public int getVehicleType() {
        return VehicleType;
    }
    public String getVehicleType_str(){ // returns vehicle type as a string
        return vehicle[VehicleType-1];
    }
    public String getPaymentType_str(){ // returns payment type as a string
        return payTypeStr[PaymentType-1];
    }

}
