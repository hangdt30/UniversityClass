import java.time.LocalDate;

public class HouseKeepingStaff extends Staff{

    public HouseKeepingStaff(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        super(firstName, lastName, birthday, role, type, joinedDate);
    }

    @Override
    public void jobDescription(){
        System.out.println("My role is: Keep the office is clean");
    }

    @Override
    public void workTime(){
        System.out.println("Work 4 hours per day. 5 days per week");
    }
}
