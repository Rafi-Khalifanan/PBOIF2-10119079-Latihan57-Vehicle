package pboif2.pkg10119079.latihan57.vehicle;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        super();
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount=gearCount;
    }
}