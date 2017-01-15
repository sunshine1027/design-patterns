package com.sunshine1027.test.adapter;

import com.sunshine1027.adapter.classadapter.Adapter;
import com.sunshine1027.adapter.classadapter.Target;
import com.sunshine1027.adapter.objectadapter.Employee;
import com.sunshine1027.adapter.objectadapter.ForeignEmployee;
import com.sunshine1027.adapter.objectadapter.Teacher;
import com.sunshine1027.adapter.objectadapter.TitleType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class AdapterTest {
    @Test
    public void objectAdapterTest() {
        Employee nativeLecturerEmployee = new Teacher(11,"native", TitleType.LECTURER, 35);
        Employee nativeProfessorEmployee = new Teacher(11,"native", TitleType.PROFESSOR, 35);

        Employee foreignLecturerEmployee = new ForeignEmployee(22, "foreign", TitleType.LECTURER, 40);
        Employee foreignProfessorEmployee = new ForeignEmployee(22, "foreign", TitleType.PROFESSOR, 50);
        Assert.assertEquals(BigDecimal.valueOf(35 * 6), nativeLecturerEmployee.getSalary());
        Assert.assertEquals(BigDecimal.valueOf(35 * 10), nativeProfessorEmployee.getSalary());
        Assert.assertEquals(BigDecimal.valueOf(22 * 40), foreignLecturerEmployee.getSalary());
        Assert.assertEquals(BigDecimal.valueOf(22 * 50), foreignProfessorEmployee.getSalary());
    }

    @Test
    public void classAdapterTest() {
        Target target = new Adapter();
        target.method1();
        target.method2();
        target.method3();
    }
}
