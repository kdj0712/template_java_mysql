package quests;

public class AdditionsSub {
    public void texts() {
        System.out.println("값을 구하고자 하는 두 수를 입력하세요");
    }

    // 더하기 메소드
    public static int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("더하기 연산 중 에러 발생: " + e.getMessage());
            return 0;
        }
    }

    // 빼기 메소드
    public static int subtract(int a, int b) {
        try {
            return a - b;
        } catch (Exception e) {
            System.out.println("빼기 연산 중 에러 발생: " + e.getMessage());
            return 0;
        }
    }

    // 곱하기 메소드
    public static int multiply(int a, int b) {
        try {
            return a * b;
        } catch (Exception e) {
            System.out.println("곱하기 연산 중 에러 발생: " + e.getMessage());
            return 0;
        }
    }

    // 나누기 메소드
    public static int divide(int a, int b) {
        try {
            if (b == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        } catch (IllegalArgumentException e) {
            System.out.println("나누기 연산 중 에러 발생: " + e.getMessage());
            return 0;
        }
    }

    // 나머지 메소드
    public static int remainder(int a, int b) {
        try {
            if (b == 0) {
                throw new IllegalArgumentException("0으로 나머지 연산을 할 수 없습니다.");
            }
            return a % b;
        } catch (IllegalArgumentException e) {
            System.out.println("나머지 연산 중 에러 발생: " + e.getMessage());
            return 0;
        }
    }

    // 메인 메소드 - 메소드 테스트
    public static void main(String[] args) {
        int x = 10 , y = 0; // y 값을 0으로 설정하여 예외 처리를 확인합니다.

        // 메소드 호출 및 결과 출력
        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
        System.out.println("Remainder: " + remainder(x, y));
    }

    // 메인 메소드 - 메소드 테스트
    // public static void main(String[] args) {
    //     double x = 10.0, y = 5.0;
    // }
}
