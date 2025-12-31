class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        //this is copy constructor where all the parameters of s1 is copied 

    }
    Student(){}
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}


public class polymorphism {
    public static void main(String args[]){
    Student s1=new Student();
    s1.name ="Pavan";
    s1.age=24;

    s1.printInfo(s1.age);
    }
}
