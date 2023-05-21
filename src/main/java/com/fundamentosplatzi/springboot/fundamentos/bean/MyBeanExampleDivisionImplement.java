package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanExampleDivisionImplement implements MyBeanExampleDivision{
    @Override
    public void division(int number) {
        System.out.println(number / number);
    }
}
