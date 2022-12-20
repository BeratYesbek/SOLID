package interfaceSegregation.chapter2.abstracts;

import interfaceSegregation.chapter2.abstracts.common.CreditCalculator;

public interface HousingLoanCalculator extends CreditCalculator {
    float calculateHousingLoan();
}
