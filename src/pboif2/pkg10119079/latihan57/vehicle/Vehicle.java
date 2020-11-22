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
public class Vehicle {
      private String myBrand,myModel;
    
    public Vehicle(){
        String name[]  = getClass().getCanonicalName().split("\\.");
        System.out.println(name[name.length -1]);
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        this.myBrand=brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel=model;
    }
    
}

