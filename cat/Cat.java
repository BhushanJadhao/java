package cat;
public class Cat {
    String Name ;
    int age ;
    int livesRemaning;

    public void meow(){
        System.out.println("meow meow");
    }
    public static void main(String [] args){
        Cat myCat=new Cat();
        myCat.meow();
        
    }

    
}
