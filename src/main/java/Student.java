import java.time.LocalDate;

public class Student implements Person {
    String firstName;
    String lastName;
    LocalDate birthday;
    String type;
    LocalDate joinedDate;

    public Student(String firstName, String lastName, LocalDate birthday, String role, String type, LocalDate joinedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.type = type;
        this.joinedDate = joinedDate;
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
        System.out.println("I'm a student");
    }

    @Override
    public void getJoinDate() {
        System.out.println("I joined to VinUni in " + joinedDate);
    }

    public void getStudentType() {
        if (type == "graduated") System.out.println("I graduated!");
        else if (type == "learning") System.out.println("I am studying");
        else System.out.println("I am going to join in the future");
    }
}
