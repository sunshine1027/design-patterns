package com.sunshine1027.test.memento;

import com.sunshine1027.memento.Caretaker;
import com.sunshine1027.memento.IMemento;
import com.sunshine1027.memento.PlayOriginator;
import com.sunshine1027.memento.PlayerMemento;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class PlayerMementoTest {
    @Test
    public void test() {
        PlayOriginator playOriginator = new PlayOriginator("Jack", 120, 10, 1000);
        IMemento playerMemento = playOriginator.createMemento();
        System.out.println(playOriginator.toString());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(playerMemento);

        //after kill enemy
        playOriginator.setAttack(100);
        playOriginator.setHealth(800);

        System.out.println(playOriginator.toString());

        //load the memento
        playOriginator.loadMemento((PlayerMemento) caretaker.getMemento());
        System.out.println(playOriginator.toString());
    }

}
