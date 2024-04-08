package co_templates;

import java.util.ArrayList;

public class TryCatchsSubs {
    // public void MethodsSubs(){
    // System.out.println("MethodsSubs - methodsSubs()");
    // }
    // 접근자 리턴 메소드이름(파라메터) {
    // return 0;
    // }
    // void : return type이 없는 경우 사용한다.
    public void methodsSubs() {
        System.out.println("MethodsSubs - methodsSubs()");
    }

    // with params
    public void methodSubsWithParams(String fname, int count) {
        System.out.println("MethodsSubs - methodSubsWithParams(string fname)");
        System.out.println("params : fname-" + fname);
        return;
    }

    // with params
    // public int methodSubsWithParamsReturn(int firstNumber, int secondNumber) {
    //     int resultNumber = 0;
    //     try {
    //         System.out.println("MethodsSubs - methodSubsWithParams(int firstNumber, int secondNumber)");
    //         System.out.println("params : firstNumber - " + firstNumber + ", secondNumber-" + secondNumber);
    //         int resultNumber = firstNumber + secondNumber;
    //     } catch (Exception e) {
    //         System.out.println("methodSubsWithParamsReturn(int firstNumber, int secondNumber)catch(Exception e)");
    //     }
    //     return resultNumber;
    // }

    public int returnException(int firstNumber) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        int result = 0;

        try {
            System.out.println(myNumbers.get(10));
            result = myNumbers.get(10);
        } catch (Exception e) {
            System.out.println("catch(Exception e) : "+e.getMessage());
            result = myNumbers.get(0);
        }
        return;
    }

}
