package com.juaracoding;

public class TaxSalary {

    // method calculateTaxSalary
    public double calculateTaxSalary(double salary) {
        return salary * 0.1;
    }

    // method totalSalary = salary - method calculateTaxSalary
    public double totalSalary(double salary){
        return salary - calculateTaxSalary(salary);
    }

}
