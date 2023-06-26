package FactoryPattern.AbstractFactory;

public class BiologyClassroom extends ClassroomFactory{

    public BiologyClassroom(Integer id, String name){
        super(id, name);
    }
    public Classroom createStudent() {
        return new Student(super.getId(), super.getName(), "Biology");
    }


    public Classroom createTeacher() {
        return new Teacher(super.getId(), super.getName(), "Biology");
    }
}
