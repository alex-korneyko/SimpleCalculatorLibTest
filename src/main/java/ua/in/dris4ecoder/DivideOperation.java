package ua.in.dris4ecoder;

import ua.in.dris4ecoder.SimpleCalculator.BinaryOperation;

/**
 * Created by Alex Korneyko on 13.07.2016 10:07.
 */
public class DivideOperation implements BinaryOperation {
    @Override
    public double calculate(double v, double v1) {
        return v / v1;
    }

    @Override
    public char getOperator() {
        return '/';
    }
}
