import java.time.LocalDate;

public class InternLecturer extends Lecturer {
 int internTime;

    public InternLecturer(String firstName, String lastName, LocalDate birthday, String role, String type, String department, LocalDate joinedDate, int internTime) {
        super(firstName, lastName, birthday, role, type, department, joinedDate);
        this.internTime=internTime;
    }

    @Override
    public void workTime(){
        System.out.println("Work 4 hours per day. 5 days per week");
    }
}
