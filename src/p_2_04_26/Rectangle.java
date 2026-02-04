package p_2_04_26;

public class Rectangle
{
    private double height;
    private double length;

    public Rectangle(double h, double l) // This is a parameterized constructor.
    {
        height = h;
        length = l;
    }
    public double getHeight()
    {
        return height;
    }

    public double getLength()
    {
        return length;
    }
}
