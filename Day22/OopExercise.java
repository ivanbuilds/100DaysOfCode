package oopexercise;

public class OopExercise {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(1, "Leo", "Messi");
        
        System.out.println("Id student 2: " + stu2.getId());
        System.out.println("Name student 1: " + stu2.getFirstName());
        System.out.println("Last name student 2: " + stu2.getLastName());
        
        stu1.setId(7);
        stu1.setFirstName("Cristiano");
        stu1.setLastName("Ronaldo");
        
        System.out.println("***********");
        System.out.println("Id student 2: " + stu1.getId());
        System.out.println("Name student 2: " + stu1.getFirstName());
        System.out.println("Last name student 2: " + stu1.getLastName());
        
        stu2.setId(10);
        
        System.out.println("***********");
        System.out.println("Id student 2: " + stu2.getId());
        System.out.println("Name student 2: " + stu2.getFirstName());
        System.out.println("Name student 2: " + stu2.getLastName());
    }
    
}
