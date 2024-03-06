package ru.netology.unit;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void ifAmountLess1000Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifAmountMore1000Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifAmountIs1000Test() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}
