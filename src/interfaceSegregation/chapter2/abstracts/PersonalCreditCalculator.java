package interfaceSegregation.chapter2.abstracts;

import interfaceSegregation.chapter2.abstracts.common.CreditCalculator;

public interface PersonalCreditCalculator extends CreditCalculator {
    float calculatePersonalCredit();

}
