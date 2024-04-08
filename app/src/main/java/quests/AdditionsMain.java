package quests;
import java.util.Scanner;
public class AdditionsMain {
    public static void main(String[] args){
        AdditionsSub subs = new AdditionsSub();
        subs.texts();
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요 : ");
        int numberfirst = scanner.nextInt();
        System.out.print("두번째 수를 입력하세요 : ");
        int numbersecond =scanner.nextInt();
        scanner.close();
        int results = subs.additionssub(numberfirst,numbersecond);
        System.out.println("두 수의 합: " + results);
    }
}

