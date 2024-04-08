package co_templates;

public class TryCatchsMains {
    public static void main(String[] args) {
        // try {
        // // Block of code to try
        // }
        // catch(Exception e) {
        // // Block of code to handle errors
        // }
        try {
            TryCatchsSubs subs = new TryCatchsSubs();
            // subs.methodsSubs();
            // subs.methodSubsWithParams("김덕재",5);
            // int result = subs.methodSubsWithParamsReturn(5,6);
            int result = subs.returnException(3);
            return;
        } catch (Exception e) {
            // Block of code to handle errors
            System.out.println(("catch(Exception e)"));
        }
        return;
    }

}
