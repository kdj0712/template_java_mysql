package quests;

public class ArithmeticsSub {
    public int sum(int first, int second) {
        System.out.println(first + "+" + second);
        int result = first + second;
        return result;
    }
    public int minus(int first, int second) {
        System.out.println(first + "-" + second);
        int result = first - second;
        return result;
    }
    public int multiply(int first, int second) {
        System.out.println(first + "*" + second);
        int result = first * second;
        return result;
    }
    public int remain(int first, int second) {
        System.out.println(first + "%" + second);
        int result = first % second;
        return result;
    }
}
