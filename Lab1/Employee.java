
public class Employee {

    private String firstname;
    private String lastname;
    private double salary;

    // Constructor
    public Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public Employee(String firstname, String lastname) {
        this(firstname, lastname, 0);
    }

    // Methods
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void getFullname() {
        System.out.println("Fullname : " + firstname + " " + lastname);
    }

    public double updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            // do nothing
        }
        return newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public double getYearlySalary() {
        return getSalary() * 12;
    }

    public double raiseSalary() {
        double raiseSalary = this.salary * (1.0 + (10.0 / 100.0));
        return this.salary = raiseSalary;
    }
}
