import java.time.LocalDate;

public class AccountantStaff extends Staff{

    public AccountantStaff(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        super(firstName, lastName, birthday, role, type, joinedDate);
    }
    @Override
    public void jobDescription(){
        System.out.println("My role is: Preparing accounts and tax returns. Monitoring spending and budgets");
    }
    @Override
    public void workTime(){
        super.workTime();
        System.out.println("OT in each quarter to ensure the quality");
    }
}
