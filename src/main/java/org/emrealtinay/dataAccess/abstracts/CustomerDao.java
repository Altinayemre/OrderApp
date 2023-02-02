package org.emrealtinay.dataAccess.abstracts;

import org.emrealtinay.entities.Customer;
import org.emrealtinay.entities.Invoice;
import org.emrealtinay.entities.Sector;

import java.util.List;
import java.util.Map;

// The method signatures of the customers were defined in this interface
public interface CustomerDao {
    void add(Customer customer);
    List<Customer> getCustomerList();
    List<Customer> getCustomerListWithC();
    List<String> getNameOverInvoices(int amount);
    double getCustomerInJuneTotalAmountList();


}
