package project.calculator.step3;

import project.calculator.step2.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean complete = false;

        // 객체 생성
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        // 스캐너 생성
        Scanner number = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 값 입력 받기 : 반복
        while (true) {
            System.out.print("첫번째 값을 입력해주세요. : ");
            String inputNumberOne = number.next();
            Number numberOne = inputNumberOne.contains(".") ? Double.parseDouble(inputNumberOne) : Integer.parseInt(inputNumberOne);


            System.out.print("연산자를 입력해주세요. : ");
            char inputOperator = operator.next().charAt(0);
            OperatorType operatorType = OperatorType.fromChar(inputOperator);

            System.out.print("두번째 값을 입력해주세요. : ");
            String inputNumberTwo = number.next();
            Number numberTwo = inputNumberTwo.contains(".") ? Double.parseDouble(inputNumberTwo) : Integer.parseInt(inputNumberTwo);

            double result = calculator.calculator(numberOne, numberTwo, operatorType);
            System.out.println("결과 : " + result);

            // 저장된 결과 가져오기 Getter
            System.out.println("현재 저장된 결과 : " + calculator.getResults());

            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? (예 : Y ㅣ 아니오: 아무 키 입력) : ");
            String inputAnswer = sc.next();
            if (inputAnswer.equalsIgnoreCase("Y")) {
                calculator.removeResults();
                System.out.println("가장 먼저 저장된 결과 삭제 후 : " + calculator.getResults());
            }

            // 특정 값 보다 큰 결과를 조회하는 로직
            System.out.print("특정 값보다 큰 결과를 조회하시겠습니까? (예 : Y ㅣ 아니오: 아무 키 입력) : ");
            String query = sc.next();
            if(query.equalsIgnoreCase("Y")) {
                System.out.print("기준 값을 입력하세요 : ");
                double threshold = sc.nextDouble();
                System.out.println("기준보다 큰 결과들 : " + calculator.getResultsGreaterThan(threshold));
            }


            // 계속 계산을 진행할건지 사용자에게 물어봄 : 반복
            while (true) {
                System.out.print("계산을 계속 진행하시겠습니까? (Y: 계속ㅣEXIT: 나가기) : ");
                String inputOver = sc.next().trim();

                if (inputOver.equalsIgnoreCase("Y")) {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("[ 계산을 계속 진행합니다. ]");
                    break;
                } else if (inputOver.equalsIgnoreCase("EXIT")) {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("[ 계산을 종료합니다. ]");
                    complete = true;
                    break;
                } else {
                    System.out.println("Y또는 EXIT를 입력해주시기 바랍니다.");
                }
            }
            if (complete) {
                break;
            }
        }
        // 스캐너 닫기
        number.close();
        operator.close();
        sc.close();
    }
}

