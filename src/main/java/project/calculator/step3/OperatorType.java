package project.calculator.step3;

public enum OperatorType {
    ADD('+') {
        @Override
        public double apply(double numberOne, double numberTwo) {
            return numberOne + numberTwo;
        }
    },

    SUB('-') {
        @Override
        public double apply(double numberOne, double numberTwo) {
            return numberOne - numberTwo;
        }
    },

    MUL('*') {
        @Override
        public double apply(double numberOne, double numberTwo) {
            return numberOne * numberTwo;
        }
    },

    DIV('/') {
        @Override
        public double apply(double numberOne, double numberTwo) {
            // 예외처리 : 0으로 나눌 수 없음
            if(numberTwo == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return numberOne / numberTwo;
        }
    };

    private final char symbol;

    // 생성자 만들기
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    // 추상 메서드
    public abstract double apply(double numberOne, double numberTwo);

    public static OperatorType fromChar(char operator) {
        for(OperatorType op : values()) {
            if(op.symbol == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자 입니다.");
    }
}
