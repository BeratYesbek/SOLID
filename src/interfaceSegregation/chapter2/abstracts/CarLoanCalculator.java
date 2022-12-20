package interfaceSegregation.chapter2.abstracts;

import interfaceSegregation.chapter2.abstracts.common.CreditCalculator;

public interface CarLoanCalculator extends CreditCalculator {
    float calculateCarLoan();

}
