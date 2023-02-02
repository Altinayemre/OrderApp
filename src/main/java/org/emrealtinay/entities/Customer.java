package org.emrealtinay.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class Customer {
    private String userName;
    private LocalDate registrationDate;
    private List<Invoice> invoices;


    public Customer(String userName, LocalDate registrationDate, Invoice... invoices) {
        this.userName = userName;
        this.registrationDate = registrationDate;
        this.invoices = new ArrayList<>(Arrays.asList(invoices));
    }

    @Override
    public String toString(){
        return "Name: "+ getUserName()+" - Registered_date: "+getRegistrationDate()+" - Invoice: "+getInvoices();
    }
}






