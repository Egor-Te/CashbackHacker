package ru.netology.CashbackService;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackTest {
    @Test
    public void CashbackBeforeThousand900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void CashbackBeforeThousand100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(100);
        int expected = 900;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldCashbackThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
