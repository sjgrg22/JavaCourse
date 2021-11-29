package Constructor;

public class ParCons {

    //instance variable
    public int id;
    public String name;

    //parameter constructor
    public ParCons(int id, String name){
        //this refers to instance variable to the current parameter.
        this.id = id;
        this.name = name;
        System.out.println("Id is: "+id+" "+"String is: "+name);
    }

    public static void main(String[] args) {
        ParCons parCons = new ParCons(121, "java");
    }
}

