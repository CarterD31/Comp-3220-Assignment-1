/**
 * @author Carter Dyck
 * @version 1.0
 * 
 * Class CCanvas makes a list of 10 random shapes.
 * it uses java.util.Random to generate a random list of shapes,
 * and uses java.util.ArrayList for the list of shapes
 */
import java.util.Random;
import java.util.ArrayList;
/**
 * The class itself is to create an ArrayList of 10 random shapes
 * that cannot have duplicates
 */
public class CCanvas
{
    //Defines the ArrayList and the random variable to be used
    ArrayList<CShape> shapes = new ArrayList<CShape>();
    Random rand = new Random();
    
    //Contructor for the Canvas
    public CCanvas(){
        while(shapes.size() < 10){
            //Random variable to chose 1 of 4 possible shapes
            int choice = rand.nextInt(4);
            //Switch statement chooses a different shape
            switch(choice){
                //Oval case
                case 0:
                    COval oval = new COval();
                    boolean add1 = true;
                    //You can only check the existing list if it isn't empty
                    if(shapes.size() > 0)
                        //Loop goes through the whole list
                        for(int i = shapes.size()-1;i >= 0;i--)
                            /**
                             * Checks if the current indec of the list contains the
                             * same kind of shape, and if it does then it checks to
                             * see if it has identical dimentions.  If it does, then
                             * it doesn't add it to the list
                             */
                            if(shapes.get(i).getShapeName().equals("Oval"))
                                if((oval.getXRadius() == shapes.get(i).getXRadius()
                                && oval.getYRadius() == shapes.get(i).getYRadius())
                                || (oval.getXRadius() == shapes.get(i).getYRadius()
                                && oval.getYRadius() == shapes.get(i).getXRadius())){
                                    add1 = false;
                                    oval.decID();
                                }
                    if(add1)//If the shape doesn't exist already, then it's added to the list
                        shapes.add(oval);
                    add1 = true;//Sets back to true for the next loop(s)
                    break;
                //Circle case
                case 1:
                    CCircle circle = new CCircle();
                    boolean add2 = true;
                    //You can only check the existing list if it isn't empty
                    if(shapes.size() > 0)
                        //Loop goes through the whole list
                        for(int i = shapes.size()-1;i >= 0;i--)
                            /**
                             * Checks if the current indec of the list contains the
                             * same kind of shape, and if it does then it checks to
                             * see if it has identical dimentions.  If it does, then
                             * it doesn't add it to the list
                             */
                            if(shapes.get(i).getShapeName().equals("Circle"))
                                if(circle.getRadius() == shapes.get(i).getRadius()){
                                    add2 = false;
                                    circle.decID();
                                }
                    if(add2)//If the shape doesn't exist already, then it's added to the list
                        shapes.add(circle);
                    add2 = true;//Sets back to true for the next loop(s)
                    break;
                //Rectangle case
                case 2:
                    CRectangle rectangle = new CRectangle();
                    boolean add3 = true;
                    //You can only check the existing list if it isn't empty
                    if(shapes.size() > 0)
                        //Loop goes through the whole list
                        for(int i = shapes.size()-1;i >= 0;i--)
                            /**
                             * Checks if the current indec of the list contains the
                             * same kind of shape, and if it does then it checks to
                             * see if it has identical dimentions.  If it does, then
                             * it doesn't add it to the list
                             */
                            if(shapes.get(i).getShapeName().equals("Rectangle"))
                                if((rectangle.getLength() == shapes.get(i).getLength()
                                && rectangle.getWidth() == shapes.get(i).getWidth())
                                || (rectangle.getLength() == shapes.get(i).getWidth()
                                && rectangle.getWidth() == shapes.get(i).getLength())){
                                    add3 = false;
                                    rectangle.decID();
                                }
                    if(add3)//If the shape doesn't exist already, then it's added to the list
                        shapes.add(rectangle);
                    add3 = true;//Sets back to true for the next loop(s)
                    break;
                //Square case
                case 3:
                    CSquare square = new CSquare();
                    boolean add4 = true;
                    //You can only check the existing list if it isn't empty
                    if(shapes.size() > 0)
                        //Loop goes through the whole list
                        for(int i = shapes.size()-1;i >= 0;i--)
                            /**
                             * Checks if the current indec of the list contains the
                             * same kind of shape, and if it does then it checks to
                             * see if it has identical dimentions.  If it does, then
                             * it doesn't add it to the list
                             */
                            if(shapes.get(i).getShapeName().equals("Square"))
                                if(square.getSideLength() == shapes.get(i).getSideLength()){
                                    add4 = false;
                                    square.decID();
                                }
                    if(add4)//If the shape doesn't exist already, then it's added to the list
                        shapes.add(square);
                    add4 = true;//Sets back to true for the next loop(s)
                    break;
                default://This should never happen but just in case
                    System.out.print("Error.");
            }
            
        }
    }
    
    public void printCanvas(){//This goes through and prints all shapes in the list
        System.out.println(">> Canvas has the following random shapes:");
        for(int i = 0;i < 10;i++){
            shapes.get(i).printInfo();
        }
    }
}