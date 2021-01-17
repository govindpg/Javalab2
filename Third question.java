3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
a class named 'Triangle' without any parameter in its constructor.

import java.util.*;
public class Triangle
{
    public Triangle()
    {
        double perimeter,area;
        int x=3, y=4, z=5;
        perimeter = x+y+z;
        double s=perimeter/2.0;
        area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("Area of triangle: "+area);
        System.out.println("Perimeter of Trinagle: "+perimeter);
    }
    public static void main(String[]args){
        Triangle t = new Triangle();
    }
}

Answers;
Area of triangle: 6.0
Perimeter of Trinagle: 12.0
