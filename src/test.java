import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class test {
    private main calculator;

    @Before
    public void init(){
        calculator = new main();
    }

    @Test
    public void emptyStringReturnsZero() throws Exception {
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueIsReplied() throws Exception {
        Assert.assertEquals(calculator.calculate("1"), 1);
    }

    @Test
    public void twoNumbersCommaDelimitedReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1,2"),3);
    }

    @Test
    public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1\n2"),3);
    }

    @Test
    public void threeNumbersDelimitedBothWaysReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1,2,3"), 6);
    }

    @Test(expected = Exception.class)
    public void negativeInputReturnsException() throws Exception {
        calculator.calculate("-1");
    }

    @Test
    public void ignoresNumbersGreaterThanAThousand() throws Exception {
        Assert.assertEquals(calculator.calculate("10,10,1001"), 20);
    }
}
