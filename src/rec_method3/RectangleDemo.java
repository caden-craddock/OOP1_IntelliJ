package rec_method3;
/*
The purpose of this program is to test a bug caused by "shadowing." If the parameter within "Rectangle.java" is
set to "height" and the variable "height" also equals "height" then the output will be 0 instead of the setHeight
chosen. Basically, shadowing is a waste of time and shouldn't ever be done. It causes programs to run even if they are
wrong.

The point of the "myclass" class within this program is to further prove that shadowing can completely ruin a program
by mistake without exactly knowing why. It's basically a colossal waste of time to create this program.
 */

public class RectangleDemo
{
    public static void main(String[] args)
    {
        //Rectangle r3 = new Rectangle();
        //r3.setHeight(100);
        //System.out.println("The height of the third rectangle is: " + r3.getHeight() + ".");

        myclass m = new myclass();

        System.out.println(m.var);
        System.out.println(m.method1());
        System.out.println(m.method());
        System.out.println(m.method1());
        System.out.println(m.var);
    }

}
