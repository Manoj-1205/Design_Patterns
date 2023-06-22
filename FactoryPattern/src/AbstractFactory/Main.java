package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        ClassroomFactory factory = new BiologyClassroom(1, "Sam");
        Classroom student = factory.createStudent();
        student.createUser(5, "Manoj");
        Classroom teacher = factory.createTeacher();
        teacher.createUser(10, "Selvi");
    }
}
