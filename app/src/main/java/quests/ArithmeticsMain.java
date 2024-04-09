package quests;
import java.util.Scanner;

public class ArithmeticsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // InputHandler 클래스를 사용하여 두 숫자 입력받기
            int a = ArithmeticsInputOutput.getInput("첫 번째 숫자를 입력하세요:");
            int b = ArithmeticsInputOutput.getInput("두 번째 숫자를 입력하세요:");
             
            // 사용자에게 원하는 연산 유형 묻기
            System.out.println("원하는 연산의 번호를 입력하세요: 1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 나머지");
            int operation = Integer.parseInt(scanner.nextLine()); // 연산 유형 입력
             
            // 선택된 연산에 따라 Calculator 클래스의 메소드를 호출
            int result = 0;
            switch (operation) {
                case 1:
                    result = AdditionsSub.add(a, b);
                    break;
                case 2:
                    result = AdditionsSub.subtract(a, b);
                    break;
                case 3:
                    result = AdditionsSub.multiply(a, b);
                    break;
                case 4:
                    result = AdditionsSub.divide(a, b);
                    break;
                case 5:
                    result = AdditionsSub.remainder(a, b);
                    break;
                default:
                    System.out.println("올바른 연산 유형을 선택해주세요.");
                    return;
            }
            
            // 연산 결과 출력
            System.out.println("연산 결과: " + result);
        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자나 연산 유형을 입력해주세요.");
        } catch (Exception e) {
            System.out.println("예상치 못한 에러가 발생했습니다: " + e.getMessage());
        } finally {
            scanner.close(); // Scanner 객체를 안전하게 닫음
        }
    }
}

