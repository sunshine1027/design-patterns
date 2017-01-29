package com.sunshine1027.test.chainfresponsity;

import com.sunshine1027.chainofresponsity.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ChainTest {
    @Test
    public void test() {
        GeneralManagerHandler generalManagerHandler = new GeneralManagerHandler();
        TechnicalDirectorHandler technicalDirectorHandler = new TechnicalDirectorHandler(generalManagerHandler);
        TechnicalManagerHandler technicalManagerHandler = new TechnicalManagerHandler(technicalDirectorHandler);

        RestMsg john = new RestMsg("John", 12, LevelType.P4);
        RestMsg susan = new RestMsg("Susan", 25, LevelType.P5);
        RestMsg lee = new RestMsg("Lee", 12, LevelType.P6);
        RestMsg jack = new RestMsg("Jack", 24 * 2, LevelType.P6);
        RestMsg frank = new RestMsg("Frank", 24 * 2, LevelType.P7);
        RestMsg peter = new RestMsg("Peter", 24 * 100, LevelType.P4);

        Assert.assertEquals(Constants.REQUEST_SUCCESS_BY_TECHNICAL_MANAGER__MSG, technicalManagerHandler.requestForRest(john));
        Assert.assertEquals(Constants.REQUEST_SUCCESS_BY_TECHNICAL_DIRECTOR_MSG, technicalManagerHandler.requestForRest(susan));
        Assert.assertEquals(Constants.REQUEST_SUCCESS_BY_TECHNICAL_DIRECTOR_MSG, technicalManagerHandler.requestForRest(lee));
        Assert.assertEquals(Constants.REQUEST_SUCCESS_BY_TECHNICAL_DIRECTOR_MSG, technicalManagerHandler.requestForRest(jack));
        Assert.assertEquals(Constants.REQUEST_SUCCESS_BY_GENERAL_MANAGET_MSG, technicalManagerHandler.requestForRest(frank));
        Assert.assertEquals(Constants.HANDLER_NOT_FIND_MSG, technicalManagerHandler.requestForRest(peter));

    }
}
