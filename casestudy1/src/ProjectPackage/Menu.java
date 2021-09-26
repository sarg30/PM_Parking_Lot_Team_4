package ProjectPackage;

import java.util.Scanner;

public class Menu extends Customer{

    public void Greetings(){
        System.out.println("Hello and welcome to the parking lot");
    }



    public static void main(String[] args) {
        Scanner in=Scanner(System.in);
        Menu obj= new Menu();
        obj.Greetings();

        //Calling all the methods from Customer class for setting the details of the customer
        obj.setCustomername();
        obj.setVehicleType();
        obj.setPaymentType();
        if(obj.getPaymentType_str()!="Fastag"){
            obj.setBalance();
        }
        obj.setFuelType();

        //in the setfloor setslot functions we should add the input thing and sysout for description of the move user has to make

        // setEntryTime();
        
        // A function dependent on the manager class to display the free slots
        
        //the following methods need to go in customer class

        // public void setEntryGate(){
        //     System.out.println("Plese enter the gate number you want to enter through (1/2)");
        //     gateNumber=scan.nextInt();
        // }

        // setfloor setslot setentrytime setexittime need to be static methodss

    }
}
