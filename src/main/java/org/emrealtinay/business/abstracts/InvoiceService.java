package org.emrealtinay.business.abstracts;

import org.emrealtinay.entities.Invoice;
import org.emrealtinay.entities.Sector;

import java.util.*;


public interface InvoiceService {
    List<Invoice> getInvoiceList();
    List<Invoice> getListByInvoiceAmount(int amount);
    double getAverageOfInvoiceAmount(int amount);
    Set<Sector> getSectorNamesLowerThanAverageInvoiceAmount(int amount);
}
