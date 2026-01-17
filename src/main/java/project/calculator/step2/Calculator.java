package project.calculator.step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> results = new ArrayList<>();

    public Integer calculator(int numberOne, int numberTwo, String operator) {
        int result;

        switch (operator) {
            case "+" -> result = numberOne + numberTwo;
            case "-" -> result = numberOne - numberTwo;
            case "*", "x", "X" -> result = numberOne * numberTwo;
            case "/" -> {
                if (numberTwo == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = numberOne / numberTwo;
            }
            default -> throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void removeResults() {
        results.remove(0);
    }
}
