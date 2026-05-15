class A extends Object{
  
   public A(){
      super();
    System.out.println("In A");
   }

   public A(int n){
    super();
    System.out.println("int in A");
   }
    
}
class B extends A{

     
    public  B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        this();
        System.out.println("int in B");
    }

}

public class Demo{
    public static void main(String[] args) {
        B ob = new B(5);
        
    }
}