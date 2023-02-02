package org.emrealtinay.dataAccess.concretes;

import org.emrealtinay.dataAccess.abstracts.CustomerDao;
import org.emrealtinay.entities.Customer;
import org.emrealtinay.entities.Invoice;
import org.emrealtinay.entities.Sector;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryCustomerDao implements CustomerDao {
    // In this structure, we keep customers in the memory section of your computer
    public List<Customer> customers;

    public InMemoryCustomerDao() {
        customers = new ArrayList<>();
        customers.add(new Customer("Jack01", LocalDate.of(2019, 6, 22),
                new InMemoryInvoiceDao().invoices.get(0)));
        customers.add(new Customer("Christiana02", LocalDate.of(2021, 4, 8),
                new InMemoryInvoiceDao().invoices.get(1)));
        customers.add(new Customer("Alexander03", LocalDate.of(2019, 7, 16),
                new InMemoryInvoiceDao().invoices.get(2)));
        customers.add(new Customer("Frank04", LocalDate.of(2022, 1, 15),
                new InMemoryInvoiceDao().invoices.get(3)));
    }

    // Method for adding new customers
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    // Method used to list customers
    @Override
    public List<Customer> getCustomerList() {
        this.customers.forEach(System.out::println);
        return customers;
    }

    // Method that returns a list of customers with the letter 'C' in it
    @Override
    public List<Customer> getCustomerListWithC() {
        return this.customers.stream()
                .filter(customer -> customer.getUserName().startsWith("C"))
                .collect(Collectors.toList());
    }

    // The method that returns the names of customers with invoices lower than the value of the entered parameter
    @Override
    public List<String> getNameOverInvoices(int amount) {
        return this.customers.stream()
                .filter(customer -> customer.getInvoices().stream().anyMatch(invoice -> invoice.getAmount() < amount))
                .map(customer -> customer.getUserName())
                .collect(Collectors.toList());
    }

    // Method to return the total invoice amount of registered customers in June
    @Override
    public double getCustomerInJuneTotalAmountList() {
        return this.customers.stream()
                .filter(customer -> customer.getRegistrationDate().getMonthValue() == 6)
                .flatMap(invoice -> invoice.getInvoices().stream())
                .mapToDouble(Invoice::getAmount).sum();
    }


}
