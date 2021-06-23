import java.time.LocalDate;

public class SecurityStaff extends Staff{

    public SecurityStaff(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        super(firstName, lastName, birthday, role, type, joinedDate);
    }
    @Override
    public void jobDescription(){
        System.out.println("My role is: Secures premises and personnel by patrolling property; monitoring surveillance equipment; inspecting buildings, equipment, and access points; permitting entry");
    }
    @Override
    public void workTime(){
        System.out.println("twelve- hour shifts. From 12:00 pm or 00.00 am");
    }

}
