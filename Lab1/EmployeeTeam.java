
class EmployeeTeam {

    private final Employee boss;
    private final Employee employee;

    // Constructor
    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    // Methods
    public void printEmployeeDetails() {
        System.out.println(employee.getFirstname() + " " + employee.getLastname() + " " + employee.getSalary() + " $\n");
    }

    public void printAllEmployeeDetails() {
        System.out.println("Boss : " + boss.getFirstname() + " " + boss.getLastname() + " " + boss.getSalary() + " $");
        System.out.println("Employee : " + employee.getFirstname() + " " + employee.getLastname() + " " + employee.getSalary() + " $");
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (boss.getFirstname().equals(firstname)) {
            boss.updateSalary(newSalary);
        } else if (employee.getFirstname().equals(firstname)) {
            employee.updateSalary(newSalary);
        } else {
            System.out.println("No employee with first name : " + firstname);
        }
    }

    public void giveRaiseToAllEmployee() {
        boss.raiseSalary();
        employee.raiseSalary();
        System.out.println();
    }
}
