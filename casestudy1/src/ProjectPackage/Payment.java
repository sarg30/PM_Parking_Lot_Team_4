package ProjectPackage;
import java.text.ParseException;
import java.util.*;
//import ProjectPackage.*;
class Payment implements Timer_Class {
    private static double HandiFee=20.0f; //default cost
    private static double MotorFee=20.0f; //default cost
    private static double CompactFee=20.0f; //default cost
    private static double LargeFee=20.0f; //default cost
    private static double electricFee=10.0f; //default cost
    static Scanner scan=new Scanner (System.in);

    void settingFee(double c1,double c2, double c3, double c4,double electric){
        HandiFee=c1; 
        MotorFee=c2; 
        CompactFee=c3; 
        LargeFee=c4;
        electricFee=electric;
        System.out.println("The charges are set as specified.");
    }
    Payment(){
        HandiFee=20.0f; 
        MotorFee=20.0f; 
        CompactFee=20.0f; 
        LargeFee=20.0f;
        electricFee=10.0f;
        System.out.println("The charges per hour are set to default: ");
        System.out.println("Handicapped Vehicle Fee=20.0\nMotorcycle Fee=20.0\nCompactVehicle Fee=20.0\nLarge Vehicle Fee=20.0\nelectricity charges=10.0f");
    }

    //Calling_Payment should be used to excute payment transactions | 1- electric 2- diesel
    public void Calling_Payment(Customer c) throws ParseException {
        long park_duration=Timer_Class.tottime(c.getentryTime().trim(),c.getexitTime().trim());
        Timer_Class.tottime("01-05-2021/12:11:22","01-05-2021/12:11:32");
        if(c.getFuelType()==1)electric_fee(park_duration,c);
        else diesel_fee(park_duration,c);

    }
    static void billing_notification()
    {
        System.out.println("The Billing Process has Begun...");
    }
    //for electric vehicles
    static void electric_fee(long park_duration,Customer c) throws ParseException{
        billing_notification();
        System.out.println("Enter the charging Time Duration in hh:mm:ss format: ");
        String charge_time=scan.nextLine().trim();
        if(charge_time.length()!=8){
            System.out.println("The Input format for charge time duration is wrong.\n Please try entering the charge in the format specified");
            electric_fee(park_duration,c);
        }
        double charge_time_hr=Math.ceil(Integer.parseInt(charge_time.substring(0,2))+(Double.parseDouble(charge_time.substring(3,5))/60.0f));
        System.out.println("Your charging cost applied for "+charge_time_hr+" hrs is : "+charge_time_hr*electricFee);
        double total_cost=charge_time_hr*electricFee+Calculating_Park_Bill(park_duration,c.getVehicleType());
        Bill_Display(total_cost,c);
    }
    // for diesel based vehicles
    static void diesel_fee(long park_duration,Customer c){
        billing_notification();
        double total_cost=Calculating_Park_Bill(park_duration,c.getVehicleType());
        Bill_Display(total_cost,c);
    }
    //1-handicapped, 2-motor, 3-compact, 4-large
    static double Calculating_Park_Bill(long park_duration,int vehicleType)//calculating total parking cost
    {
        double cost=0.0f,baseRate;
        if(vehicleType==1)baseRate=HandiFee;
        else if(vehicleType==2)baseRate=MotorFee;
        else if(vehicleType==3)baseRate=CompactFee;
        else baseRate=LargeFee;

        if(vehicleType==3)baseRate=baseRate*2;
        else if(vehicleType==4)baseRate=baseRate*3;
        int i=0;
        for(;park_duration!=0&&i<2;i++){
            cost+=baseRate;
            baseRate=baseRate/2;
            park_duration--;
        }
        cost+=park_duration*baseRate;
        System.out.println("Parking Cost: "+cost);
        return cost;
    }
    static void Bill_Display(double total_cost,Customer c){
        System.out.printf("Your total parking cost: "+total_cost+"\n");
        if(c.getPaymentType()==1||c.getPaymentType()==2||c.getPaymentType()==3){
            if(c.getBalance()<total_cost){
                System.out.println("your payment choice "+c.getPaymentType_str()+" doesn't have enough money!!!");
                System.out.println("Please Enter Your credit card ID to process your Payment: ");
                String creditID=scan.nextLine().trim();
                System.out.println(total_cost+" have been deducted from your credit card with ID "+creditID);
                
            }
            else {
                if (c.getPaymentType()==1)System.out.println(total_cost+" have been paid via cash.");
                else if (c.getPaymentType()==2){
                    System.out.println("Please enter your Debit Card ID: ");
                    String debit=scan.nextLine().trim();
                    System.out.println(total_cost+" have been deducted from your card with ID "+debit);
                }
                else {
                    System.out.println("Enter UPI ID: ");
                    String UPI=scan.nextLine().trim();
                    System.out.println(total_cost+" have been deducted from your account with ID "+UPI);
                }
            }
        }
        else {
            if(c.getFastagBalance()<total_cost){
                System.out.println("Your Fastag balance is low.");
                if(c.getBalance()+c.getFastagBalance()<total_cost){
                    System.out.println("your payment choice "+c.getPaymentType_str()+" doesn't have enough money!!!");
                    System.out.println("Please Enter Your credit card ID to process your Payment: ");
                    String creditID=scan.nextLine().trim();
                    System.out.println(total_cost+" have been deducted from your credit card with ID "+creditID);

                }
                else {
                    System.out.println(c.getFastagBalance()+" has been deducted from Fastag account and "+(total_cost-c.getFastagBalance()));
                    c.modifyFastTagBalance(0.0f);
                }
            }
            else {
                System.out.println(total_cost+" has been deducted from your fastag account.");
                c.modifyFastTagBalance(c.getFastagBalance()-total_cost);
                System.out.println("your fastag balance = "+c.getFastagBalance());
            }
        }
        c.setpaystat(true);
        c.setparkStatus(false);
        System.out.println("Payment is Succesfull.");
        System.out.println("Thank You for availaing our Services. Please visit again. :-D");
    }
}
