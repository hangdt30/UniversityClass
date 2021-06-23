import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        FullTimeLecturer steven = new FullTimeLecturer("Steven", "Gerrard", LocalDate.of(1980,12,12),"Lecturer","full-time","Biology",LocalDate.of(2019,12,20));
        steven.getName();
        steven.getBirthday();
        steven.getJoinDate();
        steven.getDepartment();
        steven.getRole();
        steven.workTime();

        System.out.println("------------------");

        AccountantStaff laura = new AccountantStaff("Laura", "Swift", LocalDate.of(1988,12,31),"staff","accountant",LocalDate.of(2020,12,12));
        laura.getName();
        laura.getBirthday();
        laura.getJoinDate();
        laura.getStaffType();
        laura.getRole();
        laura.jobDescription();
        laura.workTime();

        System.out.println("------------------");

        GraduatedStudent allan = new GraduatedStudent("Allan","Walker",LocalDate.of(1990,2,28),"Student","Graduated",LocalDate.of(2016,9,30),LocalDate.of(2020,6,30));
        allan.getName();
        allan.getBirthday();
        allan.getStudentType();
        allan.getRole();
        allan.getStudentType();



    }
}
