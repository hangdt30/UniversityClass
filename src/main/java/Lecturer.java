import java.sql.SQLOutput;
import java.time.LocalDate;

public class Lecturer implements Person {
    String firstName;
    String lastName;
    LocalDate birthday;
    String role;
    String type;
    String department;
    LocalDate joinedDate;

    public Lecturer(String firstName, String lastName, LocalDate birthday, String role, String type, String department, LocalDate joinedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.role = role;
        this.type = type;
        this.department = department;
        this.joinedDate = joinedDate;
    }


    @Override
    public void getName() {
        System.out.println("Hello, my name is: " + firstName + " " + lastName);
    }

    @Override
    public void getBirthday() {
        System.out.println("My birthday is: " + birthday);
    }

    @Override
    public void getRole() {
        System.out.println("I'm a " + type + role);
    }

    @Override
    public void getJoinDate() {
        System.out.println("I joined in VinUni from " + joinedDate);

    }

    public void getDepartment() {
        System.out.println("My department is: " + department);

    }

    public void workTime(){
        System.out.println("Work 8 hours per day, 5 days per week");
    }
}
