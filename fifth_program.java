5.Create a class with a method that prints "This is parent class" and its subclass with another method that
prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

class Parent
{
    void methd1()
    {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent
{
    void methd2()
    {
        System.out.println("This is child class.");
    }
}
class inher
{
    public static void main(String[] args)
    {
        Parent Pobj = new Parent(); //Creating object of parent class
        Pobj.methd1();               // Calling method of parent class using object of parent
        Child Cobj = new Child();   //Creating object of child class
        Cobj.methd2();               //Calling method of child class using object of child
        Cobj.methd1();               // Calling method of parent class using object of parent
    }
}

Answers;
This is parent class.
This is child class.
This is parent class