public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("6","4"));
    }
    public static String addStrings(String num1, String num2) {
        int realNum1, realNum2;
        realNum1 = Integer.parseUnsignedInt(num1);
        realNum2 = Integer.parseUnsignedInt(num2);
        int result = realNum1 + realNum2;
        return Integer.toString(result);
    }
}
