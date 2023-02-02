package org.emrealtinay.business.concretes;

import org.emrealtinay.business.abstracts.InvoiceService;
import org.emrealtinay.dataAccess.abstracts.InvoiceDao;
import org.emrealtinay.entities.Invoice;
import org.emrealtinay.entities.Sector;

import java.util.*;


public class InvoiceManager implements InvoiceService {
    // Dependency Injection
    InvoiceDao invoiceDao;

    public InvoiceManager(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return this.invoiceDao.getInvoiceList();
    }

    @Override
    public List<Invoice> getListByInvoiceAmount(int amount) {
        return this.invoiceDao.getListByInvoiceAmounts(amount);
    }

    @Override
    public double getAverageOfInvoiceAmount(int amount) {
        return this.invoiceDao.getAverageOfInvoiceAmounts(amount);
    }

    @Override
    public Set<Sector> getSectorNamesLowerThanAverageInvoiceAmount(int amount) {
        return this.invoiceDao.getSectorNamesLowerThanAverageInvoiceAmount(amount);
    }

}
