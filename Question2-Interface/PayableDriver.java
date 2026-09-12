import java.util.ArrayList;

public class PayableDriver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Alice", "Johnson", 40.00, 35));
        payables.add(new Freelancer("Brian", "Lee", 32.50, 46));
        payables.add(new VendorInvoice("Tech Supplies Inc.", "INV-1001", 1250.00));
        payables.add(new VendorInvoice("Campus Printing", "INV-1002", 875.50));

        double totalPayout = 0.0;

        System.out.println("PAYABLE ITEMS");
        System.out.println("=============");

        for (Payable payable : payables) {
            payable.print();
            totalPayout += payable.calculatePayment();
            System.out.println();
        }

        System.out.printf("Total payout for the period: $%,.2f%n", totalPayout);
    }
}
