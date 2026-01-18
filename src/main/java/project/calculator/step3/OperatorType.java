package project.calculator.step3;

public enum OperatorType {
    ADD('+'),

    SUB('-'),

    MUL('*'),

    DIV('/');

    private final char symbol;

    // 생성자 만들기
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromChar(char operator) {
        for(OperatorType op : values()) {
            if(op.symbol == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자 입니다.");
    }
}
