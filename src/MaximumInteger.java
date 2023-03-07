public class MaximumInteger {

    public static void testMax(Integer aInt, Integer bInt, Integer cInt) {
        Integer max = aInt;
        if (bInt.compareTo(max) > 0) {
            max = bInt;
        }
        if (cInt.compareTo(max) > 0) {
            max = cInt;
        }
        System.out.println("Maximum Integer = " + max);
    }

    public static void testMax(Float aF1, Float bF1, Float cF1) {
        Float max = aF1;
        if (bF1.compareTo(max) > 0) {
            max = bF1;
        }
        if (cF1.compareTo(max) > 0) {
            max = cF1;
        }
        System.out.println("Maximum Float = " + max);

    }

    public static void main(String[] args) {
        Integer xInt = 9, yInt = 14, zInt = 25;
        Float xF1 = 8.6f, yF1 = 3.8f, zF1 = 7.7f;

        MaximumInteger.testMax(xInt, yInt, zInt);
        MaximumInteger.testMax(xF1, yF1, zF1);
    }

}