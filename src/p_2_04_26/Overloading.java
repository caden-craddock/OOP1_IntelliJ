package p_2_04_26;
/*
This is an example of method overloading. This is when 2 or more methods have the same name.
 */
public class Overloading
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public double add(double a, double b, double c)
    {
        return a + b + c;
    }

    public double add(double a, double b)
    {
        return a + b;
    }

    public String add(String a, String b)
    {
        return a + b;
    }

}
