import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DollarCalculatorTest {

    @Mock
    public MarketApi marketApi;
    //테스트가 실행되기 이전에
    @BeforeEach
    public void init(){
        //marketApi가 connect될 떄, 원래 1100인데 그게 아닌 3000을 리턴하겠다.
        Mockito.lenient().when(marketApi.connect()).thenReturn(3000);
    }

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
    @Test
    public void mockTest(){
        //MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();

        Calculator calculator = new Calculator(dollarCalculator);
        Assertions.assertEquals(60000,calculator.sum(10,10));
        Assertions.assertEquals(0,calculator.minus(10,10));

    }

}
