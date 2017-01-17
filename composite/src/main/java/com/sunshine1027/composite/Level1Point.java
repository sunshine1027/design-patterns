package com.sunshine1027.composite;

import java.util.List;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Level1Point extends PointComposite{

    public Level1Point(){}
    public Level1Point(List<Level2Point> childList) {
        for (Level2Point child : childList) {
            add(child);
        }
    }

}
