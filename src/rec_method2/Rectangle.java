package rec_method2;

public class Rectangle
{
    private double height;
    private double length;

    public void setHeight(double h)
    {
        if (h > 0)
            height = h;
    } // Height Method

    public void setLength(double l)
    {
        if (l > 0)
            length = l;
    } // Length method

    public double getHeight()
    {
        return height;
    }

    public double getLength()
    {
        return length;
    }

    double area()
    {
        return height*length;
    }
}
