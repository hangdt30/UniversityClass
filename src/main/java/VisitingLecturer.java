import java.time.LocalDate;

public class VisitingLecturer  extends Lecturer{

String originalUniversity;
    public VisitingLecturer(String firstName, String lastName, LocalDate birthday, String role, String type, String department, LocalDate joinedDate, String originalUniversity) {
        super(firstName, lastName, birthday, role, type, department, joinedDate);
        this.originalUniversity=originalUniversity;
    }

    @Override
    public  void workTime(){
        System.out.println("Work 5 hours per week");
    }
}
