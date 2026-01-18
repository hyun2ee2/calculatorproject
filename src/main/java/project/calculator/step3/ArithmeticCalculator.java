package project.calculator.step3;
import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private final List<Integer> results = new ArrayList<>();

    public Integer calculator(int numberOne, int numberTwo, char operator) {
        int result;
        OperatorType operatorType = OperatorType.fromChar(operator);

        switch (operatorType) {
            case ADD -> result = numberOne + numberTwo;
            case SUB -> result = numberOne - numberTwo;
            case MUL -> result = numberOne * numberTwo;
            case DIV -> {
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

