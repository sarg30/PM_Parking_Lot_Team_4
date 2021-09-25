package ProjectPackage;
import java.text.ParseException;
import java.util.*;
public class Payment implements Timer_Class{
    private static double charge_per_hour=20.0f; //default cost
    private static double init_parking_cost=20.0f; //default cost
    private boolean end_payment=false;
    static Scanner scan=new Scanner (System.in);

    Payment(double charge_per_hour,double init_parking_cost) 
    //Manager can change the cost of electric charge and initial parking cost using this constructor
    {
        Payment.charge_per_hour=charge_per_hour;
        Payment.init_parking_cost=init_parking_cost;
    }

    //Calling_Payment should be used to excute payment transactions
    public static void Calling_Payment(String date1,String date2,int vehicleType,int FuelType,int PaymentType) throws ParseException {
        long park_duration=Timer_Class.tottime(date1.trim(),date2.trim());
        if(FuelType==1)electric_fee(park_duration,vehicleType,PaymentType);
        else diesel_fee(park_duration,vehicleType,PaymentType);

    }
    static void billing_notification(){
        System.out.println("The Billing Process has Begun...");
    }
   static void electric_fee(long park_duration,int vehicleType,int PaymentType) throws ParseException{
        billing_notification();
        System.out.println("Enter the charging Time Duration in hh:mm:ss format: ");
        String charge_time=scan.nextLine().trim();
        if(charge_time.length()!=8){
            System.out.println("The Input format for charge time duration is wrong.\n Please try entering the charge in the format specified");
            electric_fee(park_duration,vehicleType,PaymentType);
        }
        double charge_time_hr=Math.ceil(Integer.parseInt(charge_time.substring(0,2))+(Double.parseDouble(charge_time.substring(3,5))/60.0f));
        System.out.println("Your charging cost is applied for "+charge_time_hr+" is : "+charge_time_hr*charge_per_hour);
        double total_cost=charge_time_hr*charge_per_hour;
    }
    static void diesel_fee(long park_duration,int vehicleType,int PaymentType){
        billing_notification();
    }
    static void Calculating_Bill(){

    }
    void Bill_Display(){

    }
}
