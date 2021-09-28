package ProjectPackage;
import java.util.*;
class Slots implements Parking_Slot{
    static int[] hc=new int[obj.shandicapped];
    static int[] m=new int[obj.smotor];
    static int[] c=new int[obj.scompact];
    static int[] l=new int[obj.slarge];
    static int[] ehc=new int[obj.sElectrichandi];
    static int[] em=new int[obj.sElectricmotor];
    static int[] ec=new int[obj.selectriccompact];
    static int[] el=new int[obj.selectriclarge];

    static Scanner scan=new Scanner(System.in);

    public int handi(){
        for(int i=0;i<hc.length;i++){
            if(i==0){
                hc[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int motor(){
        for(int i=0;i<m.length;i++){
            if(i==0){
                m[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int com(){
        for(int i=0;i<c.length;i++){
            if(i==0){
                c[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int lar(){
        for(int i=0;i<l.length;i++){
            if(i==0){
                l[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int ehandi(){
        for(int i=0;i<ehc.length;i++){
            if(i==0){
                ehc[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int emotor(){
        for(int i=0;i<em.length;i++){
            if(i==0){
                em[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int ecom(){
        for(int i=0;i<ec.length;i++){
            if(i==0){
                ec[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int elar(){
        for(int i=0;i<el.length;i++){
            if(i==0){
                el[i]=1;
                return i+1;
            }  
        }
        return -1;
    }

    // ----------------------------- removal methods

    public void removehandi(int slot){
        hc[slot-1]=0;
    }
    public void removemotor(int slot){
        m[slot-1]=0;
    }
    public void removecom(int slot){
        c[slot-1]=0;
    }
    public void removelar(int slot){
        l[slot-1]=0;
    }
    public void removeEhandi(int slot){
        ehc[slot-1]=0;
    }
    public void removeEmotor(int slot){
        em[slot-1]=0;
    }
    public void removeEcom(int slot){
        ec[slot-1]=0;
    }
    public void removeElar(int slot){
        el[slot-1]=0;
    }

    //--------------------------------------



}
