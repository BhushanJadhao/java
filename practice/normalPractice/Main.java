package practice.normalPractice;

public class Main {
    public static void main(String[] args) {
        Animal human=new Animal();
        human.name="Radhika";
        human.Age=24;

//        Animal mamal=new Animal(human);
//        System.out.println(mamal.name);
//        System.out.println(mamal.Age);
//        Employee e1=new Employee();
//        e1.setName("chandu");
//        System.out.println(e1.getName());
//        e1.setAge(33);
//        System.out.println(e1.getAge());

        Car mycar=new Car();
        mycar.startEngine();
        mycar.stopEngine();
    }
}
