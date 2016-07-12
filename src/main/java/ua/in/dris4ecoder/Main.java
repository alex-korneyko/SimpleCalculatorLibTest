package ua.in.dris4ecoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.in.dris4ecoder.SimpleCalculator.BinaryOperation;
import ua.in.dris4ecoder.SimpleCalculator.Calculator;
import ua.in.dris4ecoder.SimpleCalculator.UnaryOperation;

import java.util.Scanner;

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

        calculator.addNewBinaryOperation(new MultipleOperation());
        calculator.addNewUnaryOperation(new FactorialOperation());
        double result;

        for(;;) {

            String line = new Scanner(System.in).nextLine();

            if(line.equals("exit")) {
                break;
            }

            try {
                result = calculator.compute(line);
                System.out.println(line + " = " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
