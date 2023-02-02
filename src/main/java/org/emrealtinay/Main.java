package org.emrealtinay;

import org.emrealtinay.business.abstracts.CustomerService;
import org.emrealtinay.business.abstracts.InvoiceService;
import org.emrealtinay.business.concretes.CustomerManager;
import org.emrealtinay.business.concretes.InvoiceManager;
import org.emrealtinay.dataAccess.concretes.InMemoryCustomerDao;
import org.emrealtinay.dataAccess.concretes.InMemoryInvoiceDao;
import org.emrealtinay.entities.Customer;

import java.time.LocalDate;

public class Main {

    static InvoiceService invoiceService = new InvoiceManager(new InMemoryInvoiceDao());
    static CustomerService customerService = new CustomerManager(new InMemoryCustomerDao());

    public static void main( String[] args ) {

        System.out.println("Customers List:");
        customerService.add(new Customer("Diana05", LocalDate.of(2022,6,15)));
        customerService.getCustomerList();
        System.out.println(" ");
        System.out.println("Invoices List: ");
        invoiceService.getInvoiceList();
        System.out.println(" ");
        System.out.println("Requests: ");
        System.out.println("List of customers with the letter 'C' in it: "+customerService.getCustomerListWithC());
        System.out.println("The total amount of invoices of registered customers in June: "+customerService.getCustomerInJuneTotalAmountList());
        System.out.println("List of invoices higher than the entered parameter value: "+invoiceService.getListByInvoiceAmount(1500));
        System.out.println("Average of invoices higher than the entered parameter value: "+invoiceService.getAverageOfInvoiceAmount(1500));
        System.out.println("Names of customers with invoices less than the entered parameter value: "+customerService.getNameOverInvoices(500));
        System.out.println("Sector names whose average invoice for June is lower than the entered parameter value: "+invoiceService.getSectorNamesLowerThanAverageInvoiceAmount(750));

    }
}
