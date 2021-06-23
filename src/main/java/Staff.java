import java.time.LocalDate;

public class Staff implements Person{
    String firstName;
    String lastName;
    LocalDate birthday;
    String role;
    String type;
    LocalDate joinedDate;

    public Staff(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.role = role;
        this.type = type;
        this.joinedDate=joinedDate;
    }


    @Override
    public void getName() {
        System.out.println("My name is: " + firstName + lastName);
    }

    @Override
    public void getBirthday() {
        System.out.println("My birthday is: " + birthday);
    }

    @Override
    public void getRole() {
        System.out.println("I'm working in role: " + role);
    }

    @Override
    public void getJoinDate() {
        System.out.println("I joined company in " + joinedDate);
    }
    public void getStaffType(){
        System.out.println("I'm a " + type);
    }
    public void jobDescription(){
        System.out.println("This is a job description of staff");
    }
    public void workTime(){
        System.out.println("Work 8 hours per day, 5 days per week");
    }
}
