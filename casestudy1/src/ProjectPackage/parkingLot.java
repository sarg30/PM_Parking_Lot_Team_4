package ProjectPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

interface ParkingSlot extends Manager{
    Manger obj=new ParkingSlot();
}

class Motorcycle extends Customer implements ParkingSlot{
    static int motSpots=obj.sbike;
    public static String startTime[]=new String[motSpots];
    public static String endTime[]=new String[motSpots];
    public static String username[]=new String[motSpots];
    public static Boolean occupied[]=new Boolean[motSpots];

    Motorcycle(){
        Arrays.fill(occupied,false);
        Arrays.fill(username,"");
    }

    public int findSpot(String name){
        for(int i=0;i<motSpots;i++){
            if(occupied[i]==false){
                username[i]=name;
                startTime[i]=this.startTime();
                occupied[i]=true;
                return i+1;
            }
        }
        return -1;
    }

    public int vacateSpot(String name){
        for(int i=0;i<motSpots;i++){
            if(username[i]==name){
                username[i]="";
                endTime[i]=this.endTime();
                occupied[i]=false;
                return i+1;
            }
        }
        return -1;
    }
}
// compact large handicapped electric
class Compact extends Customer implements ParkingSlot{
    static int compSpots=obj.svan;
    public static String startTime[]=new String[compSpots];
    public static String endTime[]=new String[compSpots];
    public static String username[]=new String[compSpots];
    public static Boolean occupied[]=new Boolean[compSpots];

    Compact(){
        Arrays.fill(occupied,false);
        Arrays.fill(username,"");
    }

    public int findSpot(String name){
        for(int i=0;i<compSpots;i++){
            if(occupied[i]==false){
                username[i]=name;
                startTime[i]=this.startTime();
                occupied[i]=true;
                return i+1;
            }
        }
        return -1;
    }

    public int vacateSpot(String name){
        for(int i=0;i<compSpots;i++){
            if(username[i]==name){
                username[i]="";
                endTime[i]=this.endTime();
                occupied[i]=false;
                return i+1;
            }
        }
        return -1;
    }
}

class Large extends Customer implements ParkingSlot{
    static int largeSlots=obj.struck;
    public static String startTime[]=new String[largeSlots];
    public static String endTime[]=new String[largeSlots];
    public static String username[]=new String[largeSlots];
    public static Boolean occupied[]=new Boolean[largeSlots];

    Large(){
        Arrays.fill(occupied,false);
        Arrays.fill(username,"");
    }

    public int findSpot(String name){
        for(int i=0;i<largeSlots;i++){
            if(occupied[i]==false){
                username[i]=name;
                startTime[i]=this.startTime();
                occupied[i]=true;
                return i+1;
            }
        }
        return -1;
    }

    public int vacateSpot(String name){
        for(int i=0;i<largeSlots;i++){
            if(username[i]==name){
                username[i]="";
                endTime[i]=this.endTime();
                occupied[i]=false;
                return i+1;
            }
        }
        return -1;
    }
}

class Handicapped extends Customer implements ParkingSlot{
    static int handicappedSlots=obj.shandicapped;
    public static String startTime[]=new String[handicappedSlots];
    public static String endTime[]=new String[handicappedSlots];
    public static String username[]=new String[handicappedSlots];
    public static Boolean occupied[]=new Boolean[handicappedSlots];

    Handicapped(){
        Arrays.fill(occupied,false);
        Arrays.fill(username,"");
    }

    public int findSpot(String name){
        for(int i=0;i<handicappedSlots;i++){
            if(occupied[i]==false){
                username[i]=name;
                startTime[i]=this.startTime();
                occupied[i]=true;
                return i+1;
            }
        }
        return -1;
    }

    public int vacateSpot(String name){
        for(int i=0;i<handicappedSlots;i++){
            if(username[i]==name){
                username[i]="";
                endTime[i]=this.endTime();
                occupied[i]=false;
                return i+1;
            }
        }
        return -1;
    }
}

class ElectricCar extends Customer implements ParkingSlot{
    static int ecSlots=obj.sElectricCar;
    public static String startTime[]=new String[ecSlots];
    public static String endTime[]=new String[ecSlots];
    public static String username[]=new String[ecSlots];
    public static Boolean occupied[]=new Boolean[ecSlots];

    ElectricCar(){
        Arrays.fill(occupied,false);
        Arrays.fill(username,"");
    }

    public int findSpot(String name){
        for(int i=0;i<ecSlots;i++){
            if(occupied[i]==false){
                username[i]=name;
                startTime[i]=this.startTime();
                occupied[i]=true;
                return i+1;
            }
        }
        return -1;
    }

    public int vacateSpot(String name){
        for(int i=0;i<ecSlots;i++){
            if(username[i]==name){
                username[i]="";
                endTime[i]=this.endTime();
                occupied[i]=false;
                return i+1;
            }
        }
        return -1;
    }
}

class ElectricBike extends Customer implements ParkingSlot{
    static int ebSlots=obj.sElectricBike;
    public static String startTime[]=new String[ebSlots];
    public static String endTime[]=new String[ebSlots];
    public static String username[]=new String[ebSlots];
    public static Boolean occupied[]=new Boolean[ebSlots];

    ElectricBike(){
        Arrays.fill(occupied,false);
        Arrays.fill(username,"");
    }

    public int findSpot(String name){
        for(int i=0;i<ebSlots;i++){
            if(occupied[i]==false){
                username[i]=name;
                startTime[i]=this.startTime();
                occupied[i]=true;
                return i+1;
            }
        }
        return -1;
    }

    public int vacateSpot(String name){
        for(int i=0;i<ebSlots;i++){
            if(username[i]==name){
                username[i]="";
                endTime[i]=this.endTime();
                occupied[i]=false;
                return i+1;
            }
        }
        return -1;
    }
}

public class parkingLot {
    public static void main(String[] args) {
        
    }
}
