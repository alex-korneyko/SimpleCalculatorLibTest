package ua.in.dris4ecoder;

import ua.in.dris4ecoder.SimpleCalculator.UnaryOperation;

class FactorialOperation implements UnaryOperation {

    @Override
    public double calculate(double v) {

        int result = 1;
        for (int i = 2; i <= v; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public char getOperator() {
        return 'f';
    }
}
