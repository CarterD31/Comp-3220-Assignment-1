/**
 * @author Carter Dyck
 * @version 1.0
 * 
 * Class CRectangle is the class for the rectangle shape
 * it uses java.util.Random to generate random sizes for the shape
 */
import java.util.Random;

//This class defines the rectangle shape
public class CRectangle extends CShape
{
    //Private variable declaration
    private int length;
    private int width;
    private int rectangleID;
    private String shapeName = "Rectangle";
    Random rand = new Random();
    
    //Constructor method
    public CRectangle(){
        length = rand.nextInt(100) + 1;
        width = rand.nextInt(100) + 1;
        incID();
        rectangleID = getID();
    }
    
    /**
     * @Overloaded constructor method with @param newLength
     * and @param newWidth
     */
    public CRectangle(int newLength,int newWidth){
        length = newLength;
        width = newWidth;
        incID();
        rectangleID = getID();
    }
    
    //Setter method with @param newLength
    public void setLength(int newLength){
        length = newLength;
    }
    
    //Setter method with @param newWidth
    public void setWidth(int newWidth){
        width = newWidth;
    }
    
    //Getter method with @return length
    @Override public int getLength(){
        return length;
    }
    
    //Getter method with @return width
    @Override public int getWidth(){
        return width;
    }
    
    //Getter method with @return shapeName
    @Override public String getShapeName(){
        return shapeName;
    }
    
    //Method that prints the shapes ID, name and size
    @Override public void printInfo(){
        System.out.printf("Shape %d: RECTANGLE %dx%d\n", rectangleID, getLength(), getWidth());
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
    @Override public int getSideLength(){
        return -1;
    }
}