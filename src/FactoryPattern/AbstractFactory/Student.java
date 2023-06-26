package FactoryPattern.AbstractFactory;

public class Student extends Classroom{
    String subject;
    public Student(Integer id, String name, String subject){
        super(id , name);
        this.subject = subject;
    }

    @Override
    public void createUser(Integer id, String name) {
        System.out.println("Student  "+name+" object created with id "+id+" for subject "+subject);
    }
}
