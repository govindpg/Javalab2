1.Write a Java class having overloaded methods to calculate area of rectangle
and circle.

   class methods
{
    void area(double a)
    {
        double c = 3.14 * a * a;
        System.out.println("the area of the circle is "+c);
    }
    void area(float a, float b)
    {
        System.out.println("the area of the rectangle is "+a*b);
    }

}
    class ovrlod
    {
        public static void main(String args[])
        {
            methods ob = new methods();
            ob.area(8.5);
            ob.area(6,12);
        }
    }

answer
the area of the circle is 226.865
the area of the rectangle is 72.0
