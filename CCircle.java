/**
 * @author Carter Dyck
 * @version 1.0
 * 
 * Class CCircle is the class for the circle shape
 * it uses java.util.Random to generate random sizes for the shape
 */
import java.util.Random;

//This class defines the circle shape
public class CCircle extends COval
{
    //Private variable declaration
    private int radius;
    private int circleID;
    private String shapeName = "Circle";
    
    //Constructor method
    public CCircle(){
        radius = rand.nextInt(100) + 1;
        circleID = getID();
    }
    
    
    //@Overloaded constructor method with @param newRadius
    public CCircle(int newRadius){
        radius = newRadius;
        circleID = getID();
    }
    
    //Setter method with @param newRadius
    public void setRadius(int newRadius){
        radius = newRadius;
    }
    
    //Getter method with @return radius
    @Override public int getRadius(){
        return radius;
    }
    
    //Getter method with @return shapeName
    @Override public String getShapeName(){
        return shapeName;
    }
    
    //Method that prints the shapes ID, name and size
    @Override public void printInfo(){
        System.out.printf("Shape %d: CIRCLE %d\n", circleID, getRadius());
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
    @Override public int getLength(){
        return -1;
    }
    @Override public int getWidth(){
        return -1;
    }
    @Override public int getSideLength(){
        return -1;
    }
}