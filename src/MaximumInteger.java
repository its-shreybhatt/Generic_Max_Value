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
        Integer xInt = 19, yInt = 34, zInt = 55;
        Float xF1 = 18.6f, yF1 = 5.8f, zF1 = 59.7f;
        String xStr="car" , yStr= "demo" , zStr = "hockey";

        MaximumInteger.maximum(xInt, yInt, zInt);
        MaximumInteger.maximum(xF1, yF1, zF1);
        MaximumInteger.maximum(xStr, yStr, zStr);
    }

}