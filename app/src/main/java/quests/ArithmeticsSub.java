package quests;

public class ArithmeticsSub {
    public void sum(int first, int second) {
        System.out.println(first + "+" + second);
        int result = first + second;
        return;
    }
    public void minus(int first, int second) {
        System.out.println(first + "-" + second);
        int result = first - second;
        return;
    }
    public void multiply(int first, int second) {
        System.out.println(first + "*" + second);
        int result = first * second;
        return;
    }
    public void remain(int first, int second) {
        System.out.println(first + "%" + second);
        int result = first % second;
        return;
    }
}
