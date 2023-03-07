public class MaximumInteger {

    public static void testMax (Integer aInt, Integer bInt, Integer cInt){
        Integer max = aInt;
        if (bInt.compareTo(max)>0){
            max = bInt;
        }
        if (cInt.compareTo(max)>0){
            max = cInt;
        }
        System.out.println("Maximum Integer = " +max);
    }
    public static void main(String[] args) {
        Integer xInt = 9, yInt =4, zInt = 5;

        MaximumInteger.testMax(xInt,yInt,zInt);

    }
}