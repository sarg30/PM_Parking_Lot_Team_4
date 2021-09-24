import java.text.SimpleDateFormat;  
import java.util.Date; //importing all the packages required for
public class Timer_Class {
    public String Date_Time() // to get instantaneous system date as string
    {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date=new Date();
    return formatter.format(date).trim();
    }
    public int Difference(int num1,int num2) // to find diference between two numbers
    {
        return Math.abs(num2-num1);
    }
    public int TotalTime(String entrytime,String exittime)// to calculate parking time duration
    {
        int entry_yr=Integer.parseInt(entrytime.substring(6,10));
        int exit_yr=Integer.parseInt(exittime.substring(6,10));
        int entry_mon=Integer.parseInt(entrytime.substring(3,5));
        int exit_mon=Integer.parseInt(exittime.substring(3,5));
        int entry_day=Integer.parseInt(entrytime.substring(0,2));
        int exit_day=Integer.parseInt(exittime.substring(0,2));
        int entry_hr=Integer.parseInt(entrytime.substring(11,13));
        int exit_hr=Integer.parseInt(exittime.substring(11,13));
        int entry_min=Integer.parseInt(entrytime.substring(14,16));
        int exit_min=Integer.parseInt(exittime.substring(14,16));
        int entry_sec=Integer.parseInt(entrytime.substring(17,19));
        int exit_sec=Integer.parseInt(exittime.substring(17,19));

        int TotalTime_hr=0;

        return TotalTime_hr;
    }
}
