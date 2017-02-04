package com.sunshine1027.test.strategy;

import com.sunshine1027.strategy.CustomService;
import com.sunshine1027.strategy.DomesticConsumer;
import com.sunshine1027.strategy.RegularMember;
import com.sunshine1027.strategy.User;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class StrategyTest {
    @Test
    public void test() {
        User firstUser = new DomesticConsumer();
        CustomService customService = new CustomService(firstUser);
        customService.chatWithUser();

        User secondUser = new RegularMember();
        customService.changeUser(secondUser);
        customService.chatWithUser();
    }

}
