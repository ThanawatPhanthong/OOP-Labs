
public class EmployeeTest {

    public static void main(String[] args) {
        // Create one employee
        Employee employee1 = new Employee("William", "Shakespeaere", 5000);
        employee1.setFirstname("Romeo");
        employee1.setLastname("Montague");
        employee1.getFullname();
        employee1.updateSalary(-5500);
        System.out.println("Monthly salary : " + employee1.getSalary() + " $");
        System.out.println();

        // Create two employee
        Employee employee2 = new Employee("Winston", "Smith", 5850);
        Employee employee3 = new Employee("Tom", "Buchanan", 7925);

        employee2.getFullname();
        System.out.println("Yearly salary : " + employee2.getYearlySalary() + " $");
        System.out.println();

        employee3.getFullname();
        System.out.println("Yearly salary : " + employee3.getYearlySalary() + " $");
        System.out.println();

        // Raise salary by 10%
        employee2.raiseSalary();
        employee3.raiseSalary();

        System.out.printf("%s | Yearly salary : %.3f $%n", employee2.getFirstname(), employee2.getYearlySalary());

        System.out.printf("%s | Yearly salary : %.2f $%n", employee3.getFirstname(), employee3.getYearlySalary());
    }
}
