package practice.normalPractice;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    String name;
    int Age;
    public Animal(String name,int Age){
        this.name=name;
        this.Age=Age;
    }
    public Animal(Animal other){
        this.name=other.name;
        this.Age=other.Age;
    }
    public Animal(){
        System.out.println("Animal constructor called");
    }
    public void name(String name){
        System.out.println("name is " + name);
    }
    public void age(int Age){
        System.out.println("Age is " + Age);
    }
}
