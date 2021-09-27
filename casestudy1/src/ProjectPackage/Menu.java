package ProjectPackage;

import java.util.Scanner;

public class Menu extends Customer{
    abstract class parking_Lot{
        //private int no_floors=4; //including ground
        static boolean[] arrayhandicapped;
        private int handicapped=10;
        static boolean[] arraymotorcycle;
        private int motorcycle=20;
        private int compact=20;
        static boolean[] arraycompact;
        private int large=10;
        static boolean[] arraylarge;
        private int ehandicapped=5; //  e - electric
        static boolean[] arrayehandicapped;
        private int emotorcycle=10;
        static boolean[] arrayemotorcycle;
        private int ecompact=10;
        static boolean[] arrayecompact;
        private int elarge=2;
        static boolean[] arrayelarge;

        // all static boolean arrays are set to false by default

        void setParking_Lot(int a,int b,int c,int d,int e,int f,int g,int h){ // to change the size of slots
            handicapped=a;
            arrayhandicapped=new boolean[handicapped];
            motorcycle=b;
            arraymotorcycle=new boolean[motorcycle];
            compact=c;
            arraycompact=new boolean[compact];
            large=d;
            arraylarge=new boolean[large];
            ehandicapped=e;
            arrayehandicapped=new boolean[ehandicapped];
            emotorcycle=f;
            arrayemotorcycle=new boolean[emotorcycle];
            ecompact=g;
            arrayecompact=new boolean[ecompact];
            elarge=h;
            arrayelarge=new boolean[elarge];
        }
        //                          -----------------------   Updating occupancies ---------------------
        public void setOccupancyhandicapped(int slot,boolean b){ 
            arrayhandicapped[slot-1]=b;
        }
        public void setOccupancymotor(int slot,boolean b){ 
            arrayhandicapped[slot-1]=b;
        }
        public void setOccupancycompact(int slot,boolean b){
            arrayhandicapped[slot-1]=b;
        }
        public void setOccupancylarge(int slot,boolean b){ 
            arrayhandicapped[slot-1]=b;
        }
        public void setOccupancyEhandicapped(int slot,boolean b){ 
            arrayehandicapped[slot-1]=b;
        }
        public void setOccupancyEmotor(int slot,boolean b){
            arrayemotorcycle[slot-1]=b;
        }
        public void setOccupancyEcompact(int slot,boolean b){ 
            arrayecompact[slot-1]=b;
        }
        public void setOccupancyElarge(int slot,boolean b){ 
            arrayelarge[slot-1]=b;
        }
        // ------------------------ returning slot is filled or not --------------
        public boolean getOccupancyhandicapped(int slot){ 
            return arrayhandicapped[slot-1];
        }
        public boolean getOccupancymotor(int slot){ 
            return arrayhandicapped[slot-1];
        }
        public boolean getOccupancycompact(int slot){
            return  arrayhandicapped[slot-1];
        }
        public boolean getOccupancylarge(int slot){ 
            return arrayhandicapped[slot-1];
        }
        public boolean getOccupancyEhandicapped(int slot){ 
            return arrayehandicapped[slot-1];
        }
        public boolean getOccupancyEmotor(int slot){
            return arrayemotorcycle[slot-1];
        }
        public boolean getOccupancyEcompact(int slot){ 
           return arrayecompact[slot-1];
        }
        public boolean getOccupancyElarge(int slot){ 
           return arrayelarge[slot-1];
        }
    }
// ------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------
    public void Greetings(){
        System.out.println("Hello and welcome to the parking lot");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
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
