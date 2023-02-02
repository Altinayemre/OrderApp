package org.emrealtinay.dataAccess.abstracts;

import org.emrealtinay.entities.*;

import java.util.*;


// The method signatures of the invoice are defined in this interface
public interface InvoiceDao {
    List<Invoice> getInvoiceList();
    List<Invoice> getListByInvoiceAmounts(int amount);
    double getAverageOfInvoiceAmounts(int amount);
    Set<Sector> getSectorNamesLowerThanAverageInvoiceAmount(int amount);

}
