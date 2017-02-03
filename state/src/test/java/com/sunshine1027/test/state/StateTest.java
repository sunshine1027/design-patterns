package com.sunshine1027.test.state;

import com.sunshine1027.state.Color;
import com.sunshine1027.state.Green;
import com.sunshine1027.state.Program;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class StateTest {
    @Test
    public void test() {
        Program program = new Program(new Green(Color.YELLOW));
        for (int i = 1; i < 1000; i++) {
            program.oneSecondCall(i);
        }
    }
}
