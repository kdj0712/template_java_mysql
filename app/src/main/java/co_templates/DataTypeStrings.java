package co_templates;

public class DataTypeStrings {
  public static void main(String[] args) {
    String myStr1 = "Hello";
    String myStr2 = "Hello";
    String myStr3 = "Another String";
    String myStr4 = null;
    // myStr1 == myStr2
    // true
    // myStr1.equals(myStr2)
    // true
    // myStr1 == myStr4
    // false
    // myStr4 == null
    // true
    // "".equals(myStr4)
    // false
    // myStr4 != null && "".equals(myStr4)
    // false
    System.out.println(myStr1.equals(myStr2));
    System.out.println(myStr1.equals(myStr3));
  }
}
