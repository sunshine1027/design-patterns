package com.sunshine1027.test.templatemethod;

import com.sunshine1027.templatemethod.CollegeStudent;
import com.sunshine1027.templatemethod.HighSchoolStudent;
import com.sunshine1027.templatemethod.MiddleSchoolStudent;
import com.sunshine1027.templatemethod.Student;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class TemplateMethodTest {
    @Test
    public void test() {
        Student middle = new MiddleSchoolStudent();
        System.out.println("------------------------");
        middle.showLife();
        System.out.println("------------------------");

        System.out.println("------------------------");
        Student high = new HighSchoolStudent();
        high.showLife();
        System.out.println("------------------------");

        System.out.println("------------------------");
        Student college = new CollegeStudent();
        college.showLife();
        System.out.println("------------------------");
    }
}
