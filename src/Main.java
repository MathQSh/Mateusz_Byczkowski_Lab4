public class Main {
    public static void main(String[] args) {
        Student student =  new Student();
        student.setAge(21);
        student.setClass_group("INiN3_B");
        student.setIndex(12354);
        student.setTerm(4);
        student.setName_surname("Darek", "Jarkowski");
        Student student1 = new Student();
        student1.setAge(24);
        student1.setClass_group("INiN3_B");
        student1.setIndex(45623);
        student1.setTerm(4);
        student1.setName_surname("Marek", "Barkowski");

        System.out.println(student);
        System.out.println(student1);
        System.out.println();

        EmployeeC employeeC = new EmployeeC();
        employeeC.setAge(35);
        employeeC.setName_surname("Marek", "Towiarak");
        employeeC.setLength_internship(10);
        employeeC.setPosition(Type_position.DEALER);
        employeeC.setType_internship(Type_internship.FULLTIME);

        EmployeeC employeeC1 = new EmployeeC();
        employeeC1.setAge(25);
        employeeC1.setName_surname("Lusia" , "Marzeniak");
        employeeC1.setLength_internship(5);
        employeeC1.setPosition(Type_position.SECRETARY);
        employeeC1.setType_internship(Type_internship.HALFTIME);

        System.out.println(employeeC);
        System.out.println(employeeC1);

    }
}