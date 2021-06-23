import java.time.LocalDate;

public class FullTimeLecturer extends Lecturer {


    public FullTimeLecturer(String firstName, String lastName, LocalDate birthday, String role, String type, String department, LocalDate joinedDate) {
        super(firstName, lastName, birthday, role, type, department, joinedDate);
    }

    @Override
    public void workTime(){
        super.workTime();
    }
}
