package com.company.generic.payroll.utils;

import com.company.generic.payroll.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BonusCalculatorTests {
  @Test
  void bonusCalculationShouldBeCorrect() {
    Employee employee = new Employee("John Doe", "salesman");
    double bonus = BonusCalculator.calculateBonus(employee);

    assertEquals(800, bonus);
  }
}
