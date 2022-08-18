package ru.netology.CashbackService;

//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {


    @Test
    public void CashbackBeforeThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 500;
        int actual = cashbackHackService.remain(500);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CashbackOverThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 700;
        int actual = cashbackHackService.remain(1300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CashbackThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        Assertions.assertEquals(expected, actual);
    }
}