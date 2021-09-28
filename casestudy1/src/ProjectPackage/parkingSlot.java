package ProjectPackage;
//import java.lang.reflect.Array;
import java.util.*;

interface Parking_Slot {
    Manager obj=new Manager(); 
    //manager object - this is necessary to access the modified values of prices and slot numbers
    // without this object only default values can be accessed
}
public class parkingSlot implements Parking_Slot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Parking Slot ");
        System.out.println("choose the number corresponding to tasks. \n 1 - Manager \n 2 - Customer\n 3 - exit program");
        int choice=scan.nextInt();

        //manager functionallity allows the authorities to changes the parking lot settings
        //like number of slots & price for each slot ... this allows for universality of the code

        if(choice==1){
            System.out.println("you chose manager functionalities. You can now configure the parking lot");
            System.out.println("choose the corresponding number. \n1-configure floors\n2-configure prices\n3-set both");
            int num=scan.nextInt();
            if(num==1){
                obj.SetFoorsAndSlotQuantity();
            }
            else if(num==2){
                obj.SetCharges(Menu.payment); // refencing to the payment object defined in menu class to implement changed prices
            }
            else if(num==3){
                obj.SetFoorsAndSlotQuantity();
                obj.SetCharges(Menu.payment);
            }
            Menu.MenuInit(); 
            Menu.showMenu();
        }
        else if(choice==2){
            System.out.println("Hello customer!!!");
            Menu.MenuInit(); 
            Menu.showMenu();
        }
        else {
            System.out.println("Confirm termination : y/n");
            if(scan.next().trim()=="y")System.exit(0);
            else Menu.showMenu();
        }
        scan.close();
    }
}
