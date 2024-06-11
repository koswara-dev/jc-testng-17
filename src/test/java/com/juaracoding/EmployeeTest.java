package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;
    TaxSalary taxSalary;

    @BeforeClass
    public void setUp(){
        employee = new Employee();
        taxSalary = new TaxSalary();
        employee.setName("JuaraCoding");
        employee.setAge(20);
        employee.setSalary(7000000);
    }

    @Test
    public void testCalculateTaxSalary(){
        double expected = 700000;
        double actual = taxSalary.calculateTaxSalary(employee.getSalary()); // 700000
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTotalSalary() {
        double expected = 6300000;
        double actual = taxSalary.totalSalary(employee.getSalary());
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetSalaryNegatif(){
        employee.setSalary(-5000);
    }

}
