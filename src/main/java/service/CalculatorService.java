package service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    public int getDivision(int num1, int num2) {
        return num1 / num2;
    }
}
