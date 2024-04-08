package co_templates;

public class MethodsSubs {
    // public void MethodsSubs(){
    //     System.out.println("MethodsSubs - methodsSubs()");
    // }
    // 접근자 리턴 메소드이름(파라메터) {
    //      return 0;
    // }
    // void : return type이 없는 경우 사용한다.
    public void methodsSubs(){
        System.out.println("MethodsSubs - methodsSubs()");
    }

    //  with params
    public void methodSubsWithParams(String fname, int count){
        System.out.println("MethodsSubs - methodSubsWithParams(string fname)");
        System.out.println("params : fname-" +fname);
        return ;
    }
    //  with params
    public int methodSubsWithParamsReturn(int firstNumber, int secondNumber){
        System.out.println("MethodsSubs - methodSubsWithParams(int firstNumber, int secondNumber)");
        System.out.println("params : firstNumber - "+firstNumber+", secondNumber-"+secondNumber );
        int resultNumber = firstNumber + secondNumber;
        return resultNumber;
    }
    
}
