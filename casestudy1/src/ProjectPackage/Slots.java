package ProjectPackage;
class Slots implements Parking_Slot{
    static int[] hc=new int[obj.shandicapped];
    int[] m=new int[obj.smotor];
    int[] c=new int[obj.scompact];
    int[] l=new int[obj.slarge];
    static int[] ehc=new int[obj.sElectrichandi];
    int[] em=new int[obj.sElectricmotor];
    int[] ec=new int[obj.selectriccompact];
    int[] el=new int[obj.selectriclarge];

    void InitSlots(){ // to initialize each slot object created
        for(int i=0;i<hc.length;i++)hc[i]=0;
        for(int i=0;i<m.length;i++)m[i]=0;
        for(int i=0;i<c.length;i++)c[i]=0;
        for(int i=0;i<l.length;i++)l[i]=0;
        for(int i=0;i<ehc.length;i++)ehc[i]=0;
        for(int i=0;i<em.length;i++)em[i]=0;
        for(int i=0;i<ec.length;i++)ec[i]=0;
        for(int i=0;i<el.length;i++)el[i]=0;
    }

    // to check and allot slots in each floor

    public int handi(){
        for(int i=0;i<hc.length;i++){
            if(hc[i]==0){
                hc[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int motor(){
        for(int i=0;i<m.length;i++){
            if(m[i]==0){
                m[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int com(){
        for(int i=0;i<c.length;i++){
            if(c[i]==0){
                c[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int lar(){
        for(int i=0;i<l.length;i++){
            if(l[i]==0){
                l[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int ehandi(){
        
        for(int i=0;i<ehc.length;i++){
            if(ehc[i]==0){
                ehc[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int emotor(){
        for(int i=0;i<em.length;i++){
            if(em[i]==0){
                em[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int ecom(){
        for(int i=0;i<ec.length;i++){
            if(ec[i]==0){
                ec[i]=1;
                return i+1;
            }  
        }
        return -1;
    }
    public int elar(){
        for(int i=0;i<el.length;i++){
            if(el[i]==0){
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

    //-------------------------------------- // to check filled or not 

    public int chandi(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<hc.length;i++){
            sum+=hc[i];
            if(hc[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*hc.length))b=1;
        if(b==1){System.out.print("None");}
        System.out.println();
        return b;
    }
    public int cmotor(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<c.length;i++){
            sum+=c[i];
            if(c[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*c.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }
    public int ccom(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<c.length;i++){
            sum+=c[i];
            if(c[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*c.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }
    public int clar(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<l.length;i++){
            sum+=l[i];
            if(l[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*l.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }
    public int cehandi(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<ehc.length;i++){
            sum+=ehc[i];
            if(ehc[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*ehc.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }
    public int cemotor(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<em.length;i++){
            sum+=em[i];
            if(em[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*em.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }
    public int cecom(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<ec.length;i++){
            sum+=ec[i];
            if(ec[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*ec.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }
    public int celar(){
        int sum=0;int b=0;
        System.out.print("Emplty slots are : ");
        for(int i=0;i<el.length;i++){
            sum+=el[i];
            if(el[i]==0){
                System.out.print(" "+i+1);
            }
        }
        if(sum==(1*el.length))b=1;
        if(b==1){System.out.print("None");}System.out.println();
        return b;
    }

}
