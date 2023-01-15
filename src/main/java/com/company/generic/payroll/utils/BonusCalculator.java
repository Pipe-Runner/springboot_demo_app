package com.company.generic.payroll.utils;
import com.company.generic.payroll.Employee;

public class BonusCalculator {
    public static double calculateBonus(Employee employee) {
      return employee.getName().length() * 100;
    }
}
