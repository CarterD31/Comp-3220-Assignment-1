/**
 * @author Carter Dyck
 * @version 1.0
 * 
 * Class CSquare is the class for the square shape
 * it uses java.util.Random to generate random sizes for the shape
 */
import java.util.Random;

//This class defines the square shape
public class CSquare extends CRectangle
{
    //Private variable declaration
    private int sideLength;
    private int squareID;
    private String shapeName = "Square";
    
    //Constructor method
    public CSquare(){
        sideLength = rand.nextInt(100) + 1;
        squareID = getID();
    }
    
    //@Overloaded constructor method with @param newSideLength
    public CSquare(int newSideLength){
        sideLength = newSideLength;
        squareID = getID();
    }
    
    //Setter method with @param newSideLength
    public void setSideLength(int newSideLength){
        sideLength = newSideLength;
    }
    
    //Getter method with @return sideLength
    @Override public int getSideLength(){
        return sideLength;
    }
    
    //Getter method with @return shapeName
    @Override public String getShapeName(){
        return shapeName;
    }
    
    //Method that prints the shapes ID, name and size
    @Override public void printInfo(){
        System.out.printf("Shape %d: SQUARE %dx%d\n", squareID, getSideLength(), getSideLength());
    }
    
    /**
     * The following methods must be defined not
     * because they are used  in this way
     * but since they need to be abstract functions 
     * in the CShape class so that they can 
     * be used in the CCanvas class.
     */
    @Override public int getXRadius(){
        return -1;
    }
    @Override public int getYRadius(){
        return -1;
    }
    @Override public int getRadius(){
        return -1;
    }
    @Override public int getLength(){
        return -1;
    }
    @Override public int getWidth(){
        return -1;
    }
}