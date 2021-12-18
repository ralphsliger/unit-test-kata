package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long substract(Long number1, Long number2) {
        logger.info( "Substract {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiply {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) throws Exception {
        logger.info( "Division {} + {}", number1, number2 );
         if(number2!=0) {return number1 / number2;} else{throw new Exception("undefined");}
    }




}
