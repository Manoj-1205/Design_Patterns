package FactoryPattern.AbstractFactory;

public class ChemistryClassroom extends ClassroomFactory{
    public ChemistryClassroom(Integer id, String name){
        super(id, name);
    }
    public Classroom createStudent() {
        return new Student(super.getId(), super.getName(), "Chemistry");
    }


    public Classroom createTeacher() {
        return new Teacher(super.getId(), super.getName(), "Chemistry");
    }
}
