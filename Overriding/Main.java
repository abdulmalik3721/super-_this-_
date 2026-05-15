package Overriding;
class Override {
    public Override(){
        this(5);
        System.out.println("Parent show method");
    }

    public Override(int n){
        System.out.println("n: " + n);
    }


    public int add(int n){
        return n+1;
    }
    
}

public class Main extends Override{
    public static void main(String[] args) {
        Main ov = new Main();

       int r= ov.add(6);
       System.out.println("result: " + r);
    }

    
    public int add(int n){
        System.out.println("overridden");
        return n+5;
    }
    
}
