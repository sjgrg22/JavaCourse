package Constructor;

// Constructor is a special method.
// A java constructor is a block of code similar to a method. It is called when a instance of a class is created.
//Every time when a object is created using a new() keyword at least one constructor is created.
//It calls a default constructor if there is available in the class. In such case, Java compiler provides a constructor by default.
//1. must be same as class name
//2. constructor must have no return type.
//3. java constructor cannot be abstract, static, final, sychronized.


public class NonParCons {

    //non parameter constructor
    public NonParCons(){
        System.out.println("This is no parametrized cons");

    }

    public static void main(String[] args) {
        NonParCons nonParCons = new NonParCons();
    }
}
