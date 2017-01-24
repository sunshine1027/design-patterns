package com.sunshine1027.test.decorator;

import com.sunshine1027.decorator.ProgrammerDecorator;
import com.sunshine1027.decorator.SimpleProgrammer;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class TestDecorator {
    @Test
    public void test() {
        SimpleProgrammer simpleProgrammer = new SimpleProgrammer();
        simpleProgrammer.code();

        ProgrammerDecorator programmerDecorator = new ProgrammerDecorator(simpleProgrammer);
        programmerDecorator.code();
    }

}
