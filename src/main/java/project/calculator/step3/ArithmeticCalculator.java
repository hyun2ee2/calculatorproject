package project.calculator.step3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator {
    private final List<Double> results = new ArrayList<>();

    public <T extends Number, U extends Number> double calculator(T numberOne, U numberTwo, OperatorType operator) {

        double doubleOne = numberOne.doubleValue();
        double doubleTwo = numberTwo.doubleValue();
        double result = operator.apply(doubleOne, doubleTwo);


        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void removeResults() {
        results.remove(0);
    }

    // 특정 값 보다 큰 결과 조회 (람다&스트림 활용)
    public List<Double> getResultsGreaterThan(double threshold) {
        return results.stream()
                .filter(v -> v > threshold)
                .collect(Collectors.toList());
    }
}

