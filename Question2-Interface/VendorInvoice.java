public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        setVendorName(vendorName);
        setInvoiceNumber(invoiceNumber);
        setAmountDue(amountDue);
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = requireText(vendorName, "Vendor name");
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = requireText(invoiceNumber, "Invoice number");
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            throw new IllegalArgumentException("Amount due cannot be negative.");
        }
        this.amountDue = amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public void print() {
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice number: " + invoiceNumber);
        System.out.printf("Payment: $%,.2f%n", calculatePayment());
    }

    private static String requireText(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be blank.");
        }
        return value.trim();
    }
}
