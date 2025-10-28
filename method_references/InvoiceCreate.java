package method_references;
import java.util.stream.Stream;

class Invoice {
    String txnId;
    Invoice(String id) {
        txnId = id;
    }
}

public class InvoiceCreate {
    public static void main(String[] args) {
        String[] txns = {"T100", "T101", "T102"};
        Invoice[] invoices = Stream.of(txns).map(Invoice::new).toArray(Invoice[]::new);
        for (Invoice invoice : invoices) {
            System.out.println(invoice.txnId);
        }

    }
}
