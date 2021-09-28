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

    void InitSlots(){
        for(int i=0;i<hc.length;i++)hc[i]=0;
        for(int i=0;i<m.length;i++)m[i]=0;
        for(int i=0;i<c.length;i++)c[i]=0;
        for(int i=0;i<l.length;i++)l[i]=0;
        for(int i=0;i<ehc.length;i++)ehc[i]=0;
        for(int i=0;i<em.length;i++)em[i]=0;
        for(int i=0;i<ec.length;i++)ec[i]=0;
        for(int i=0;i<el.length;i++)el[i]=0;
    }

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

    //--------------------------------------



}
