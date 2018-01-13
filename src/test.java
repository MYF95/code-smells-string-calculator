import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class test {

    @Test
    public void emptyStringReturnsZero() throws Exception {
        main calculator = new main();
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueIsReplied() throws Exception {
        main calculator = new main();
        Assert.assertEquals(calculator.calculate("1"), 1);
    }

    @Test
    public void twoNumbersCommaDelimitedReturnSum() throws Exception {
        main calculator = new main();
        Assert.assertEquals(calculator.calculate("1,2"),3);
    }

    @Test
    public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
        main calculator = new main();
        Assert.assertEquals(calculator.calculate("1\n2"),3);
    }

    @Test
    public void threeNumbersDelimitedBothWaysReturnSum() throws Exception {
        main calculator = new main();
        Assert.assertEquals(calculator.calculate("1,2,3"), 6);
    }

    @Test(expected = Exception.class)
    public void negativeInputReturnsException() throws Exception {
        main calculator = new main();
        calculator.calculate("-1");
    }

    @Test
    public void ignoresNumbersGreaterThanAThousand() throws Exception {
        main calculator = new main();
        Assert.assertEquals(calculator.calculate("10,10,1001"), 20);
    }
}
