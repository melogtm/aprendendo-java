package models.services;

import models.interfaces.TaxService;

public class PaypalTaxService implements TaxService {
    private final static double SIMPLE_TAX = 1.0; 
    private final static double PAY_TAX = 2.0;
    
    public double simple_tax(double amount) {
        return amount * (SIMPLE_TAX / 100);
    }

    public double pay_tax(double amount) {
        return amount * (PAY_TAX / 100);
    }
}
