/**
 * @author Carter Dyck
 * @version 1.0
 * 
 * Class CShape stores both the shapeID
 * and abstract methods
 */
public abstract class CShape
{
    //This stores the current shapeID
    private static int shapeID = 0;
    
    //Method to increment the shapeID
    public void incID(){
        ++shapeID;
    }
    
    //Method to decrement the shapeID
    public void decID(){
        --shapeID;
    }
    
    //Method to get the shapeID
    public int getID(){
        return shapeID;
    }
    
    /**
     * These are mostly needed to allow use inside
     * the CCanvas class
     */
    public abstract String getShapeName();
    public abstract void printInfo();
    public abstract int getXRadius();
    public abstract int getYRadius();
    public abstract int getRadius();
    public abstract int getLength();
    public abstract int getWidth();
    public abstract int getSideLength();
    
}