package com.sunshine1027.test.abstractfactory;

import com.sunshine1027.abstractfactory.User;
import com.sunshine1027.abstractfactory.company.Blizzard;
import com.sunshine1027.abstractfactory.company.Company;
import com.sunshine1027.abstractfactory.company.Rockstar;
import com.sunshine1027.abstractfactory.games.online.DiabloGame;
import com.sunshine1027.abstractfactory.games.online.MidnightClubGame;
import com.sunshine1027.abstractfactory.games.online.OnlineGame;
import com.sunshine1027.abstractfactory.games.pc.GTAGame;
import com.sunshine1027.abstractfactory.games.pc.PCGame;
import com.sunshine1027.abstractfactory.games.pc.WOWGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class GameFactoryTest {
    private User user;
    @Before
    public void init() {
        user = new User("Jack", "jack jack");
    }

    @Test
    public void testPCGame() {
        Company blizzard = new Blizzard();
        Company rockstar = new Rockstar();
        PCGame blizzardPCGameWOW = blizzard.createPCGame();
        PCGame rockstarPCGameGTA = rockstar.createPCGame();
        final int times = 5;
        Assert.assertEquals(WOWGame.createMsg(user, times), blizzardPCGameWOW.storageProgress(user, times));
        Assert.assertNotEquals(GTAGame.createMsg(user, times), blizzardPCGameWOW.storageProgress(user, times));


        Assert.assertEquals(GTAGame.createMsg(user, times), rockstarPCGameGTA.storageProgress(user, times));
        Assert.assertNotEquals(WOWGame.createMsg(user, times), rockstarPCGameGTA.storageProgress(user, times));
    }

    @Test
    public void testOnlineGame() {
        Company blizzard = new Blizzard();
        Company rockstar = new Rockstar();
        OnlineGame blizzardOnlineGameDiablo = blizzard.createOnlineGame();
        OnlineGame rockstarOnlineGameMidnightClud = rockstar.createOnlineGame();
        final int price = 5;
        Assert.assertEquals(DiabloGame.createDiabloConsumeMsg(user, price), blizzardOnlineGameDiablo.consume(user, price));
        Assert.assertNotEquals(MidnightClubGame.createMidnightClubConsumeMsg(user, price), blizzardOnlineGameDiablo.consume(user, price));


        Assert.assertEquals(MidnightClubGame.createMidnightClubConsumeMsg(user, price), rockstarOnlineGameMidnightClud.consume(user, price));
        Assert.assertNotEquals(DiabloGame.createDiabloConsumeMsg(user, price), rockstarOnlineGameMidnightClud.consume(user, price));
    }
}
