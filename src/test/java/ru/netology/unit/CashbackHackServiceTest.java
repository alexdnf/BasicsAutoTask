package ru.netology.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void ifAmountLess1000Test() {
        CashbackHackService service = new CashbackHackService();

        int actual = 1;
        int expected = service.remain(999);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifAmountEquals1000Test() {
        CashbackHackService service = new CashbackHackService();

        int actual = 0;
        int expected = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifAmountMore1000Test() {
        CashbackHackService service = new CashbackHackService();

        int actual = 999;
        int expected = service.remain(1001);

        Assert.assertEquals(actual, expected);
    }
}
