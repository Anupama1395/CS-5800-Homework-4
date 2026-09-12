public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Weekly salary cannot be negative.");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void print() {
        System.out.println("Salaried Employee");
        printEmployeeInformation();
        System.out.printf("Weekly salary: $%,.2f%n", weeklySalary);
    }
}
