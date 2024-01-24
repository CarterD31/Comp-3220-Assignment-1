/**
 * @author Carter Dyck
 * @version 1.0
 * 
 * Class COval is the class for the oval shape
 * it uses java.util.Random to generate random sizes for the shape
 */
import java.util.Random;

//This class defines the oval shape
public class COval extends CShape
{
    //Private variable declaration
    private int xRadius;
    private int yRadius;
    private int ovalID;
    private String shapeName = "Oval";
    Random rand = new Random();
    
    //Constructor method
    public COval(){
        xRadius = rand.nextInt(100) + 1;
        yRadius = rand.nextInt(100) + 1;
        incID();
        ovalID = getID();
    }
    
    /**
     * @Overloaded constructor method with @param newXRadius
     * and @param newYRadius
     */
    public COval(int newXRadius,int newYRadius){
        xRadius = newXRadius;
        yRadius = newYRadius;
        incID();
        ovalID = getID();
    }
    
    //Setter method with @param newXRadius
    public void setXRadius(int newXRadius){
        xRadius = newXRadius;
    }
    
    //Setter method with @param newYRadius
    public void setYRadius(int newYRadius){
        yRadius = newYRadius;
    }
    
    //Getter method with @return xRadius
    @Override public int getXRadius(){
        return xRadius;
    }
    
    //Getter method with @return yRadius
    @Override public int getYRadius(){
        return yRadius;
    }
    
    //Getter method with @return shapeName
    @Override public String getShapeName(){
        return shapeName;
    }
    
    //Method that prints the shapes ID, name and size
    @Override public void printInfo(){
        System.out.printf("Shape %d: OVAL %dx%d\n", ovalID, getXRadius(), getYRadius());
    }
    
    /**
     * The following methods must be defined not
     * because they are used  in this way
     * but since they need to be abstract functions 
     * in the CShape class so that they can 
     * be used in the CCanvas class.
     */
    @Override public int getRadius(){
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