package project.calculator.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean complete = false;

        // 스캐너 생성
        Scanner number = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        Scanner over = new Scanner(System.in);

        // 사용자로부터 값 입력 받기 : 반복
        while (true) {
            System.out.print("첫번째 값을 입력해주세요. : ");
            int inputNumberOne = number.nextInt();

            if (inputNumberOne < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }

            System.out.print("연산자를 입력해주세요. : ");
            String inputOperator = operator.nextLine();

            System.out.print("두번째 값을 입력해주세요. : ");
            int inputNumberTwo = number.nextInt();

            if (inputNumberTwo < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }

            // 조건문 : 연산자에 맞게 연산하여 출력
            if (inputOperator.equals("+")) {
                System.out.println("결과 값: " + (inputNumberOne + inputNumberTwo));
            } else if (inputOperator.equals("-")) {
                System.out.println("결과 값: " + (inputNumberOne - inputNumberTwo));
            } else if (inputOperator.equalsIgnoreCase("X") || inputOperator.equals("*")) {
                System.out.println("결과 값: " + (inputNumberOne * inputNumberTwo));
            } else if (inputOperator.equals("/")) {
                if (inputNumberTwo == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println("결과 값: " + (inputNumberOne / inputNumberTwo));
                }
            } else {
                System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
            }

            // 계속 계산을 진행할건지 사용자에게 물어봄 : 반복
            while (true) {
                System.out.print("계산을 계속 진행하시겠습니까? (Y: 계속ㅣEXIT: 나가기) : ");
                String inputOver = over.nextLine();

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


    }
}
