public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber,
                              double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException(
                    "Commission rate must be between 0 and 1.");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative.");
        }
        this.grossSales = grossSales;
    }

    @Override
    public void print() {
        System.out.println("Commission Employee");
        printEmployeeInformation();
        System.out.printf("Commission rate: %.2f%%%n", commissionRate * 100);
        System.out.printf("Gross sales: $%,.2f%n", grossSales);
    }
}
