package com.codecool.kitchenmanagement;


import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

//@Getter
public class Employee {
    private String name;
    private LocalDate birthDate;
    private BigDecimal salary;

    public void printTax() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}




