package org.emrealtinay.dataAccess.concretes;


import org.emrealtinay.dataAccess.abstracts.InvoiceDao;
import org.emrealtinay.entities.Invoice;
import org.emrealtinay.entities.Sector;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;


public class InMemoryInvoiceDao implements InvoiceDao {
    // In this structure, we keep the invoices in the memory section of your computer
    public List<Invoice> invoices;

    public InMemoryInvoiceDao() {
        invoices = new ArrayList<>();
        invoices.add(new Invoice(1,"Colin's", Sector.TEXTILE, 1750, LocalDate.of(2020, 5, 20)));
        invoices.add(new Invoice(2,"L'Oreal Paris", Sector.COSMETIC, 425, LocalDate.of(2021, 6, 15)));
        invoices.add(new Invoice(3,"Nestle", Sector.FOOD, 450, LocalDate.of(2020, 6, 12)));
        invoices.add(new Invoice(4,"Microsoft", Sector.TECHNOLOGY, 3399, LocalDate.of(2022, 4, 30)));
    }

    // Method used to list invoices
    @Override
    public List<Invoice> getInvoiceList() {
        this.invoices.forEach(System.out::println);
        return this.invoices;
    }

    // Returns invoices above the amount entered as a parameter
    @Override
    public List<Invoice> getListByInvoiceAmounts(int amount) {
        return this.invoices.stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .collect(Collectors.toList());
    }

    // Returns the average of the invoices above the amount entered as a parameter
    @Override
    public double getAverageOfInvoiceAmounts(int amount) {
        return this.invoices.stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .mapToDouble(Invoice::getAmount)
                .average().orElse(0.0);
    }

    // Method that returns sector names whose average invoice for June is lower than the entered parameter value
    @Override
    public Set<Sector> getSectorNamesLowerThanAverageInvoiceAmount(int amount) {

        boolean averageFilter = this.invoices.stream()
                .filter(invoice -> invoice.getBillingDate().getMonthValue() == Month.JUNE.getValue())
                .mapToDouble(Invoice::getAmount).average().orElse(0.0) < 750;

        Set<Sector> sectors = new LinkedHashSet<>();

        if(averageFilter){
            sectors =  invoices.stream()
                    .filter(invoice -> invoice.getBillingDate().getMonthValue()==Month.JUNE.getValue())
                    .map(invoice -> invoice.getSector())
                    .collect(Collectors.toSet());
        }

        return sectors;
    }

}
