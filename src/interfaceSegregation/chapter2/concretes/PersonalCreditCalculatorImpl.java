package interfaceSegregation.chapter2.concretes;

import interfaceSegregation.chapter1.CreditCalculator;
import interfaceSegregation.chapter2.abstracts.PersonalCreditCalculator;

public class PersonalCreditCalculatorImpl implements PersonalCreditCalculator {
    @Override
    public float calculatePersonalCredit() {
        return 0;
    }

}
