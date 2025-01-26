package Abstraction.Tax_Calculation_System;

/*
 * Create an abstract class Tax with an abstract method calculateTax(). 
 * Implement subclasses IndividualTax and CorporateTax with different tax calculation logic.

 */
abstract class Tax {
    int income;

    public Tax(int income) {
        this.income = income;
    }

    abstract double calculateTax();

    abstract void disp();
}

class IndividualTax extends Tax {
    int expense;

    public IndividualTax(int income, int expense) {
        super(income);
        this.expense = expense;
    }

    public double calculateTax() {
        int taxable_income = income - expense;
        double individual_tax = 0;
        if (taxable_income > 40000) {
            int slab3 = taxable_income - 40000;
            individual_tax += slab3 * 0.02;
        } else {
            int slab2 = taxable_income - 50000;
            individual_tax += slab2 * 0.01;
        }
        return individual_tax;
    }

    public void disp() {
        System.out.println("Income : " + income + "\nIndividual tax : " + calculateTax());
    }
}

class CorporateTax extends Tax {
    int expense;
    int depreciation;

    public CorporateTax(int income, int expense, int depreciation) {
        super(income);
        this.expense = expense;
        this.depreciation = depreciation;
    }

    public double calculateTax() {
        int taxable_profit = income - expense - depreciation;
        double tax = taxable_profit * 0.25;
        return tax;
    }

    public void disp() {
        System.out.println("Income : " + income + "\nCorporate tax : " + calculateTax());
    }
}

public class TaxCalculation {
    public static void main(String[] args) {
        Tax individual = new IndividualTax(80000, 20000);
        Tax corporate = new CorporateTax(1000000, 600000, 50000);
        System.out.println("INDIVIDUAL : ");
        individual.disp();
        System.out.println("\nCORPORATE : ");
        corporate.disp();
    }
}
