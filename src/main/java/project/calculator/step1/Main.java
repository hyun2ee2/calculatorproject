package project.calculator.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 스캐너 생성
        Scanner number = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);

        // 사용자로부터 값 입력 받기
        System.out.print("첫번째 값을 입력해주세요. : ");
        int inputNumberOne = number.nextInt();

        System.out.print("연산자를 입력해주세요. : ");
        String inputOperator = operator.nextLine();

        System.out.print("두번째 값을 입력해주세요. : ");
        int inputNumberTwo = number.nextInt();

        // 조건문 : 연산자에 맞게 연산하여 출력
        if(inputOperator.equals("+")) {
            System.out.println("결과 값: " + (inputNumberOne + inputNumberTwo));
        } else if(inputOperator.equals("-")) {
            System.out.println("결과 값: " + (inputNumberOne - inputNumberTwo));
        } else if(inputOperator.equalsIgnoreCase("X") || inputOperator.equals("*")) {
            System.out.println("결과 값: " + (inputNumberOne * inputNumberTwo));
        } else if(inputOperator.equals("/")) {
            System.out.println("결과 값: " + (inputNumberOne / inputNumberTwo));
        } else {
            System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
        }


    }
}
