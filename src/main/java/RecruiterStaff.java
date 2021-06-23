import java.time.LocalDate;

public class RecruiterStaff extends Staff{

    public RecruiterStaff(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        super(firstName, lastName, birthday, role, type, joinedDate);
    }
    @Override
    public void jobDescription(){
        System.out.println("My role is: Searching open positions with talented and qualified candidates");
    }
    @Override
    public void workTime(){
        super.workTime();
    }
}
