package ua.in.dris4ecoder;

import ua.in.dris4ecoder.SimpleCalculator.BinaryOperation;

class MultipleOperation implements BinaryOperation {

    @Override
    public double calculate(double v, double v1) {
        return v * v1;
    }

    @Override
    public char getOperator() {
        return '*';
    }
}
