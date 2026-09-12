public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber, double wage,
                          double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHoursWorked(hoursWorked);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void print() {
        System.out.println("Hourly Employee");
        printEmployeeInformation();
        System.out.printf("Wage: $%,.2f%n", wage);
        System.out.printf("Hours worked: %.2f%n", hoursWorked);
    }
}
