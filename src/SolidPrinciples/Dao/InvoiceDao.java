package SolidPrinciples.Dao;

import SolidPrinciples.Pojo.Invoice;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDatabase() {
        /*
        saves Invoice object to database
         */
    }

    public void saveToFile(String fileName) {
        /*
        saves Invoice object to a file with given name
         */
    }
}
