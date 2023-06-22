package AbstractFactory;

import lombok.AllArgsConstructor;


public class Teacher extends Classroom{
    String subject;
    public Teacher(Integer id, String name, String subject){
        super(id, name);
        this.subject=subject;
    }

    @Override
    public void createUser(Integer id, String name) {
        System.out.println("Teacher "+name+" object created with id "+id+" for subject "+subject);
    }
}
