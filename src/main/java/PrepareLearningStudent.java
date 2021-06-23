import java.time.LocalDate;

public class PrepareLearningStudent extends Student{
    public PrepareLearningStudent(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        super(firstName, lastName, birthday, role, type, joinedDate);
    }

    @Override
    public void getStudentType(){
        System.out.println("I am going to study in " + joinedDate);
    }
}
