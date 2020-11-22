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
public class PBOIF210119079Latihan57Vehicle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4 FX");
        bicycle.setGearCount(23);
        
        System.out.println("Brand : " + bicycle.getBrand());
        System.out.println("Model : " + bicycle.getModel());
        System.out.println("Jumlah Gear : " + bicycle.getGearCount() + "\n");
        
        Skateboard skateboard = new Skateboard();
        
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);
        
        System.out.println("Brand : " + skateboard.getBrand());
        System.out.println("Model : " + skateboard.getModel());
        System.out.println("Panjang board : " + skateboard.getBoardLength());
    }
    
}
