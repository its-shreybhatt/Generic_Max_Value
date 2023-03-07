public class MaximumInteger {

    public static <gen extends Comparable<gen>> gen maximum( gen a, gen b, gen c) {
        gen max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum value = " + max);
        return max;
    }

    public static void main(String[] args) {
        Integer xInt = 29, yInt = 14, zInt = 5;
        Float xF1 = 18.6f, yF1 = 15.8f, zF1 = 9.7f;
        String xStr="van" , yStr= "demo" , zStr = "apple";

        MaximumInteger.maximum(xInt, yInt, zInt);
        MaximumInteger.maximum(xF1, yF1, zF1);
        MaximumInteger.maximum(xStr, yStr, zStr);
    }

}