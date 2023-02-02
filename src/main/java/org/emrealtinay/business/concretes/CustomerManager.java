package org.emrealtinay.business.concretes;

import org.emrealtinay.business.abstracts.CustomerService;
import org.emrealtinay.dataAccess.abstracts.CustomerDao;
import org.emrealtinay.entities.Customer;

import java.util.List;
import java.util.Map;

public class CustomerManager implements CustomerService {
    // Dependency Injection
    CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        this.customerDao.add(customer);
    }

    @Override
    public List<Customer> getCustomerList() {
        return this.customerDao.getCustomerList();
    }

    @Override
    public List<Customer> getCustomerListWithC() {
        return this.customerDao.getCustomerListWithC();
    }

    @Override
    public List<String> getNameOverInvoices(int amount) {
        return this.customerDao.getNameOverInvoices(amount);
    }

    @Override
    public double getCustomerInJuneTotalAmountList() {
        return this.customerDao.getCustomerInJuneTotalAmountList();
    }

}
