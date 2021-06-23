import java.time.LocalDate;

public class GraduatedStudent extends Student{
    LocalDate graduatedDate;

    public GraduatedStudent(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate, LocalDate graduatedDate) {
        super(firstName, lastName, birthday, role, type, joinedDate);
        this.graduatedDate=graduatedDate;
    }

    @Override
    public void getStudentType(){
        System.out.println("I graduated in " + graduatedDate);
    }
}
