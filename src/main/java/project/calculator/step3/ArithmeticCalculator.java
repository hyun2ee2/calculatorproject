package project.calculator.step3;
import java.util.ArrayList;
import java.util.List;

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
}

