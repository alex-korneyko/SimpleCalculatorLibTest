package ua.in.dris4ecoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.in.dris4ecoder.SimpleCalculator.Calculator;
import ua.in.dris4ecoder.SimpleCalculator.CalculatorFactory;

/**
 * Created by Alex Korneyko on 06.07.2016 20:22.
 */
@Configuration
public class AppConfig {

    @Bean
    Main main(Calculator newCalculator){
        Main main = new Main();
        main.setCalculator(newCalculator);
        return main;
    }

    @Bean
    Calculator newCalculator(){
        return CalculatorFactory.getCalculator();
    }
}
