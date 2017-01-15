package com.sunshine1027.test.adapter;

import com.sunshine1027.adapter.Employee;
import com.sunshine1027.adapter.ForeignEmployee;
import com.sunshine1027.adapter.Teacher;
import com.sunshine1027.adapter.TitleType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class AdapterTest {
    @Test
    public void test() {
        Employee nativeLecturerEmployee = new Teacher(11,"native", TitleType.LECTURER, 35);
        Employee nativeProfessorEmployee = new Teacher(11,"native", TitleType.PROFESSOR, 35);

        Employee foreignLecturerEmployee = new ForeignEmployee(22, "foreign", TitleType.LECTURER, 40);
        Employee foreignProfessorEmployee = new ForeignEmployee(22, "foreign", TitleType.PROFESSOR, 50);
        Assert.assertEquals(BigDecimal.valueOf(35 * 6), nativeLecturerEmployee.getSalary());
        Assert.assertEquals(BigDecimal.valueOf(35 * 10), nativeProfessorEmployee.getSalary());
        Assert.assertEquals(BigDecimal.valueOf(22 * 40), foreignLecturerEmployee.getSalary());
        Assert.assertEquals(BigDecimal.valueOf(22 * 50), foreignProfessorEmployee.getSalary());
    }
}
