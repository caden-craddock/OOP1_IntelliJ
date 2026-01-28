package rec_method;

public class Rectangle
{
    private double height;
    private double length;

    public void setHeight(double h)
    {
        height = h;
    }

    public void setLength(double l)
    {
        length = l;
    }

    double area()
    {
        return height*length;
    }
}
