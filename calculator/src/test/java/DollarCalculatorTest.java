import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(Mo)
public class DollarCalculatorTest {
    @Test
    public void testHello(){
        System.out.println("TEST");
    }
    @Test
    public void dollar(){
        MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();
        Calculator calculator = new Calculator(dollarCalculator);
        System.out.println(calculator.sum(10,10));

        Assertions.assertEquals(22000,calculator.sum(10,10));
        Assertions.assertEquals(0,calculator.minus(10,10));

    }

}
