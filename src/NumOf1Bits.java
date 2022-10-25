public class NumOf1Bits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int counter = 0;
        String number = Integer.toBinaryString(n);
        System.out.println(number);
        for (int i = 0; i < number.length(); i++) {
            System.out.println(number.charAt(i));
            if (number.charAt(i) == '1')
                counter++;
        }
        return counter;
    }
}
