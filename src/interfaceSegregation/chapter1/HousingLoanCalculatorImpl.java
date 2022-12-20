package interfaceSegregation.chapter1;

public class HousingLoanCalculatorImpl implements CreditCalculator {
    @Override
    public float calculatePersonalCredit() {
        return 0;
    }

    @Override
    public float calculateHousingLoan() {
        return 0;
    }

    @Override
    public float calculateCarLoan() {
        return 0;
    }
}
