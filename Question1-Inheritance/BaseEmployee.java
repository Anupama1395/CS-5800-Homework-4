public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName,
                        String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public void print() {
        System.out.println("Base Employee");
        printEmployeeInformation();
        System.out.printf("Base salary: $%,.2f%n", baseSalary);
    }
}
