package FactoryPattern.AbstractFactory;

public class MathsClassroom extends ClassroomFactory{
    public MathsClassroom(Integer id, String name){
        super(id, name);
    }
    public Classroom createStudent() {
        return new Student(super.getId(), super.getName(),"Maths");
    }


    public Classroom createTeacher() {
        return new Teacher(super.getId(), super.getName(), "Maths");
    }
}