package com.sunshine1027.test.facade;

import com.sunshine1027.facade.*;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class FacadeTest {
    @Test
    public void test() {
        Line curve = new Curve();
        Line straightLine = new StraightLine();
        Shape square = new Square();
        Shape triangle = new Triangle();

        DrawFacade.DrawFacadeBuilder builder = new DrawFacade.DrawFacadeBuilder();
        builder.buildCurve(curve)
                .buildSquare(square)
                .buildStraightLine(straightLine)
                .buildTriangle(triangle);
        DrawFacade drawFacade = builder.build();
        drawFacade.drawCurveAndSquare();
        drawFacade.drawCurveAndTriangle();
        drawFacade.drawStraightLineAndTriangle();
    }
}
