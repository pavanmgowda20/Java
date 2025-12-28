class Student {
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class classesnobjects {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Pavan";
        s1.age=24;

        s1.printName();
    }
}
