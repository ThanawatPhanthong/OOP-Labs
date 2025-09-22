public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee master = new Employee("Sherlock", "Holmes", 3500);
        Employee subordinate = new Employee("John H.", "Watson", 1350);

        EmployeeTeam team = new EmployeeTeam(master, subordinate);

        team.printEmployeeDetails();
        
        team.printAllEmployeeDetails();

        team.updateSalaryOfEmployee("Sherlock", 4525);
        team.updateSalaryOfEmployee("John H.", -1450); System.out.println();

        team.printAllEmployeeDetails();

        team.giveRaiseToAllEmployee();

        team.printAllEmployeeDetails();
    }
}
