package quests;

import java.util.Scanner;

public class ArithmeticsInputOutput {
    // 사용자로부터 double 타입의 입력을 받는 메소드
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println(prompt);
                input = Integer.parseInt(scanner.nextLine());
                isValid = true; // 성공적으로 변환되면 반복문 탈출
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자 형식입니다. 다시 입력해주세요.");
                scanner.close(); 
            }
        }

        return input;
    }

    public void prints() {
        System.out.println("");
    }

}
