package org.emrealtinay.entities;


import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@NoArgsConstructor

public class Invoice extends Company {
    private double amount;
    private LocalDate billingDate;

    public Invoice(int id,String companyName, Sector sector, double amount, LocalDate billingDate) {
        super(companyName, sector);
        this.amount = amount;
        this.billingDate = billingDate;
    }

    @Override
    public String toString(){
        return "Company_name: "+getCompanyName()+" - Sector: "+getSector()+" - Amount: "+getAmount()+" - Billing_date: "+getBillingDate();
    }

}
