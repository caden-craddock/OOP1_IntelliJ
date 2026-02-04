package p_2_04_26;
/*
Note: - A default constructor initializes everything to zero.
      - A user-defined constructor are used to initialize instance fields or create copies of objects. If a user-defined
      constructor is defined, the compiler doesn't generate the default constructor.
      - A no-argument constructor is similar to default constructor. It initializes all of the field values to zero or
      null.
      - A parameterize constructor is a constructor that accepts one or more parameters. Used to initialize an object
      with specific values at creation time. Allows different objects of the same class to be initialized with different
      data.
 */
public class Demo
{
    public static void main(String[] args)
    {
        // Print the length and height of rectangle 1.
        Rectangle r1 = new Rectangle(5, 10); // The orientation is based on the constructor.
        System.out.println("Rectangle 1:");
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Length: " + r1.getLength());

        // Print the length and height of rectangle 2.
        Rectangle r2 = new Rectangle(7, 8);
        System.out.println("\nRectangle 2:");
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Length: " + r2.getLength());

        // Print different factors of the Overloading class for "o."
        Overloading o = new Overloading();
        System.out.println("");
        System.out.println(o.add(4, 5));               // Adding 2 integers. 4 + 5 = 9
        System.out.println(o.add(4.5, 6.7));           // Adding 2 doubles. 4.5 + 6.7 = 11.2
        System.out.println(o.add(22, 15, 94));      // Adding 3 integers. 22 + 15 + 94 = 131
        System.out.println(o.add(2.8, 3.1, 1.5));   // Adding 3 doubles. 2.8 + 3.1 + 1.5 = 7.4
        System.out.println(o.add("Hello ", "World!")); // Printing 2 strings. "Hello " + "World!" = Hello World!
    }
}
