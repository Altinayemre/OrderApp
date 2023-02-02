package org.emrealtinay.business.abstracts;

import org.emrealtinay.entities.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    void add(Customer customer);
    List<Customer> getCustomerList();
    List<Customer> getCustomerListWithC();
    List<String> getNameOverInvoices(int amount);
    double getCustomerInJuneTotalAmountList();

}
