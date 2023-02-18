public class Student {
    String name;
    int age;
    String id;
    float cgpa;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID :"+id);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
    }
}
class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raihan Hossain";
        s1.id = "221-15-4827";
        s1.age = 22;
        s1.cgpa = 3.06f;
        s1.display();
    }
}
