package com.sunshine1027.composite;

import java.util.List;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class RootPoint extends PointComposite{
    public RootPoint() {}
    public RootPoint(List<Level1Point> childList) {
        for (Level1Point child :childList) {
            add(child);
        }
    }


}
