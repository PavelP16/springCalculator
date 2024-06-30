package com.skypro.calculator.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service

public class CalculatorService {
    public int getSummary(int num1, int num2) {
        return num1 + num2;
    }

    public int getSubstraction(int num1, int num2) {
        return num1 - num2;
    }

    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public float getDivision(float num1, float num2) {
        return num1 / num2;
    }
}
