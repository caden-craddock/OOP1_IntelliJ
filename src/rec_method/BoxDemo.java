package rec_method;

public class BoxDemo
{
    public static void main(String[] args)
    {
        Box box1 = new Box(); // Think of this as: "int x" or maybe "double y."
        Box box2 = new Box(); // "Box" is the value type and "box2" is the variable.
        //Box box2 = box1;    // Commenting out the line above and uncommenting this one makes box2 = box1.
        box1.height = 6;
        box1.length = 2;
        box1.width = 3;
        double vol = box1.volume();

        box2.height = 5; // If box2 = box1, then the 2 lines below including this one must be commented out to function.
        box2.length = 5;
        box2.width = 5;
        double vol2 = box2.volume();

        System.out.println("The volume of the box is: " + vol + ".");
        System.out.println("The volume of the second box is: " + vol2 + ".");
    }
}
