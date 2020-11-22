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
public class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard(){
        super();
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength=boardLength;
    }
    
}
