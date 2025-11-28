////////////////////////////////////////////////////////////////
//
// Name of Class    : Abstractdemo
// Description      : Demonstrates object creation using a derived
//                    class and executes all arithmetic operations to
//                    showcase abstraction and polymorphism.
// Author           : Omkar Suryakant Jadhav (051LI_Omkar)
// Date             : 28/11/2025
//
////////////////////////////////////////////////////////////////


abstract class Arithmetic{
    abstract public int Addition(int a, int b);
    abstract public int Subtraction(int a, int b);
    public int Multiplication(int a, int b)
    {
        return a*b;
    }
}
    class Marvellous extends Arithmetic
   { public int Addition(int a ,int b)
    {
        return a+b;
    }
    public int Subtraction(int a , int b)
    {
        return a-b;
    }
}
    

 class Abstractdemo{
    public static void main(String[] args)
    {
        Marvellous mobj = new Marvellous();
        System.out.println(mobj.Addition(10,20));         //30
        System.out.println(mobj.Subtraction(10,20));      //-10
        System.out.println(mobj.Multiplication(10,20));   //200
    }
}