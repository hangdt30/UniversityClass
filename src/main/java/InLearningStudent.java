import java.time.LocalDate;

public class InLearningStudent extends Student {
int yearOfStudy;
    public InLearningStudent(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate,int yearOfStudy) {
        super(firstName, lastName, birthday, role, type, joinedDate);
        this.yearOfStudy=yearOfStudy;
    }

    @Override
    public void getStudentType(){
        System.out.println("I have studied for " + yearOfStudy + " year(s)");
    }
}
