public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee master = new Employee("Sherlock", "Holmes", 3500);
        Employee subordinate = new Employee("John H.", "Watson", 1350);

        EmployeeTeam team = new EmployeeTeam(master, subordinate);

        team.printEmployeeDetails(); // Print employee details
        
        team.printAllEmployeeDetails(); // Print boss and employee datails

        // update Salary of both boss and employee
        team.updateSalaryOfEmployee("Sherlock", 4525);
        team.updateSalaryOfEmployee("John H.", -1450); System.out.println(); // Invalid (<=0) => NO CHANGE

        // Bofe give raise
        team.printAllEmployeeDetails();

        // Give raise to all Employee by 10%
        team.giveRaiseToAllEmployee();

        // After give raise
        team.printAllEmployeeDetails();
    }
}
