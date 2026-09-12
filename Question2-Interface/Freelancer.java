public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName,
                      double hourlyRate, double hoursWorked) {
        setFirstName(firstName);
        setLastName(lastName);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = requireText(firstName, "First name");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = requireText(lastName, "Last name");
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.hourlyRate = hourlyRate;
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
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    @Override
    public double calculatePayment() {
        double regularHours = Math.min(hoursWorked, 40.0);
        double overtimeHours = Math.max(hoursWorked - 40.0, 0.0);

        return (regularHours * hourlyRate)
                + (overtimeHours * hourlyRate * 1.5);
    }

    @Override
    public void print() {
        System.out.println("Freelancer: " + getPayeeName());
        System.out.printf("Payment: $%,.2f%n", calculatePayment());
    }

    private static String requireText(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be blank.");
        }
        return value.trim();
    }
}
