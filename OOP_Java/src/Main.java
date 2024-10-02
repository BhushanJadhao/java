public class Main {
    public static void main(String[] args) {
        Student kunal=new Student("Bhushan Jadhao",91.5f,65);

        kunal.display();
    }
    static class Student{
        String name;
        int rollNo;
        float marks;
        Student(String name,float marks,int rollNo){
            this.name=name;
            this.rollNo=rollNo;
            this.marks=marks;

        }
        public void display() {
            System.out.println(this.name);
            System.out.println(this.marks);
            System.out.println(this.rollNo);
        }

    }
}