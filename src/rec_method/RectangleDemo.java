package rec_method;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.setLength(6); // The length/width can't be accessed when private. So a method MUST be used.
        r1.setHeight(5); // This method allows length and height values to be given. And then calling "r1.area()"
                         // automatically calls the return function within the "Rectangle.java" class.
        System.out.print("The area of the rectangle is: " + r1.area());
    }

}
