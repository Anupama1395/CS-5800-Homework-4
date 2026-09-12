public class InheritanceDriver {

    public static void main(String[] args) {

        SalariedEmployee joe = new SalariedEmployee(
                "Joe", "Jones", "111-11-1111", 2500.00);

        HourlyEmployee stephanie = new HourlyEmployee(
                "Stephanie", "Smith", "222-22-2222",
                25.00, 32);

        HourlyEmployee mary = new HourlyEmployee(
                "Mary", "Quinn", "333-33-3333",
                19.00, 47);

        CommissionEmployee nicole = new CommissionEmployee(
                "Nicole", "Dior", "444-44-4444",
                0.15, 50000.00);

        SalariedEmployee renwa = new SalariedEmployee(
                "Renwa", "Chanel", "555-55-5555",
                1700.00);

        BaseEmployee mike = new BaseEmployee(
                "Mike", "Davenport", "666-66-6666",
                95000.00);

        CommissionEmployee mahnaz = new CommissionEmployee(
                "Mahnaz", "Vaziri", "777-77-7777",
                0.22, 40000.00);

        System.out.println("SALARIED EMPLOYEE");
        printBasicInformation(joe);
        System.out.printf(
                "Weekly salary: $%,.2f%n%n",
                joe.getWeeklySalary());

        System.out.println("HOURLY EMPLOYEE");
        printBasicInformation(stephanie);
        System.out.printf("Wage: $%,.2f%n",
                stephanie.getWage());
        System.out.println("Hours worked: "
                + stephanie.getHoursWorked());
        System.out.println();

        System.out.println("HOURLY EMPLOYEE");
        printBasicInformation(mary);
        System.out.printf("Wage: $%,.2f%n",
                mary.getWage());
        System.out.println("Hours worked: "
                + mary.getHoursWorked());
        System.out.println();

        System.out.println("COMMISSION EMPLOYEE");
        printBasicInformation(nicole);
        System.out.printf("Commission rate: %.0f%%%n",
                nicole.getCommissionRate() * 100);
        System.out.printf("Gross sales: $%,.2f%n%n",
                nicole.getGrossSales());

        System.out.println("SALARIED EMPLOYEE");
        printBasicInformation(renwa);
        System.out.printf(
                "Weekly salary: $%,.2f%n%n",
                renwa.getWeeklySalary());

        System.out.println("BASE EMPLOYEE");
        printBasicInformation(mike);
        System.out.printf(
                "Base salary: $%,.2f%n%n",
                mike.getBaseSalary());

        System.out.println("COMMISSION EMPLOYEE");
        printBasicInformation(mahnaz);
        System.out.printf("Commission rate: %.0f%%%n",
                mahnaz.getCommissionRate() * 100);
        System.out.printf("Gross sales: $%,.2f%n",
                mahnaz.getGrossSales());
    }

    private static void printBasicInformation(Employee employee) {
        System.out.println("Name: "
                + employee.getFirstName() + " "
                + employee.getLastName());

        System.out.println("Social Security number: "
                + employee.getSocialSecurityNumber());
    }
}