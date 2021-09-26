package ProjectPackage;
import java.text.ParseException;
import java.util.*;
class Payment implements Timer_Class{
    private static double charge_per_hour=20.0f; //default cost
    private static double init_parking_cost=20.0f; //default cost
    //private static boolean end_payment=false;
    static Scanner scan=new Scanner (System.in);

    //Calling_Payment should be used to excute payment transactions | 1- electric 2- diesel
    public static void Calling_Payment(String date1,String date2,int vehicleType,int FuelType,int PaymentType) throws ParseException {
        long park_duration=Timer_Class.tottime(date1.trim(),date2.trim());
        Timer_Class.tottime("01-05-2021/12:11:22","01-05-2021/12:11:32");
        if(FuelType==1)electric_fee(park_duration,vehicleType,PaymentType);
        else diesel_fee(park_duration,vehicleType,PaymentType);

    }
    static void billing_notification()
    {
        System.out.println("The Billing Process has Begun...");
    }
    //for electric vehicles
    static void electric_fee(long park_duration,int vehicleType,int PaymentType) throws ParseException{
        billing_notification();
        System.out.println("Enter the charging Time Duration in hh:mm:ss format: ");
        String charge_time=scan.nextLine().trim();
        if(charge_time.length()!=8){
            System.out.println("The Input format for charge time duration is wrong.\n Please try entering the charge in the format specified");
            electric_fee(park_duration,vehicleType,PaymentType);
        }
        double charge_time_hr=Math.ceil(Integer.parseInt(charge_time.substring(0,2))+(Double.parseDouble(charge_time.substring(3,5))/60.0f));
        System.out.println("Your charging cost applied for "+charge_time_hr+" hrs is : "+charge_time_hr*charge_per_hour);
        double total_cost=charge_time_hr*charge_per_hour+Calculating_Park_Bill(park_duration,vehicleType);
        Bill_Display(total_cost);
    }
    // for diesel based vehicles
    static void diesel_fee(long park_duration,int vehicleType,int PaymentType){
        billing_notification();
        double total_cost=Calculating_Park_Bill(park_duration,vehicleType);
        Bill_Display(total_cost);
    }
    //1-handicapped, 2-motor, 3-compact, 4-large
    static double Calculating_Park_Bill(long park_duration,int vehicleType)//calculating total parking cost
    {
        double cost=0.0f,baseRate=init_parking_cost;
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
    static void Bill_Display(double total_cost ){
        System.out.printf("Your total parking cost: "+total_cost+"\n");
        System.out.println("Payment is Succesfull.");
        System.out.println("Thank You for availaing our Services. Please visit us again. :-D");
    }
}
