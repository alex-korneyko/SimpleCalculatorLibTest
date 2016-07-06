package ua.in.dris4ecoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.in.dris4ecoder.SimpleCalculator.BinaryOperation;
import ua.in.dris4ecoder.SimpleCalculator.Calculator;
import ua.in.dris4ecoder.SimpleCalculator.UnaryOperation;

/**
 * Created by Alex Korneyko on 05.07.2016 19:36.
 */
public class Main {

    private Calculator calculator;

    void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Main mainClass = applicationContext.getBean("main", Main.class);

        mainClass.execute();

    }

    private void execute() {

        System.out.println(calculator.compute("2+3"));
        System.out.println(calculator.compute("10-73"));
        System.out.println(calculator.compute("20-3"));
        System.out.println(calculator.compute("200+30000000"));

        calculator.addNewBinaryOperation(new MultipleOperation());
        System.out.println(calculator.compute("10*15"));

        //Add unary operation
        calculator.addNewUnaryOperation(new UnaryOperation() {
            @Override
            public double calculate(double v) {
                return v * v;
            }

            @Override
            public char getOperator() {
                return 's';
            }
        });

        System.out.println(calculator.compute("s20"));

    }

    private class MultipleOperation implements BinaryOperation{

        @Override
        public double calculate(double v, double v1) {
            return v * v1;
        }

        @Override
        public char getOperator() {
            return '*';
        }
    }
}
