4.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its
length and breadth as parameters of its constructor and having a method named 'returnArea' which returns
the area of the rectangle. Length and breadth of rectangle are entered through keyboard.


import java.util.Scanner;
class Area{
    int length,breadth,area;
    public Area(int l, int b){
        length = l;
        breadth = b;
    }
    public void returnArea()
    {
        area=length*breadth;
        System.out.println("Area of rectangle: "+area);
    }
}
public class rectangle1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        Area a = new Area(length,breadth);
        a.returnArea();
    }
}
Answer;
Enter the length: 
50
Enter the breadth: 
25
Area of rectangle: 1250


