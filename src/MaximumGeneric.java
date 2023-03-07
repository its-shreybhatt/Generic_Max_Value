public class MaximumGeneric<gen extends Comparable<gen>> {
    gen a,b,c;

    public MaximumGeneric(gen a, gen b, gen c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public gen testMaximum(){
        return MaximumGeneric.testMaximum(a,b,c);
    }
    public static <gen extends Comparable<gen>> gen testMaximum(gen a, gen b, gen c) {
        gen max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        //System.out.println("Maximum value = " + max);
        printMax(max);
        return max;
    }

    public static <gen> void printMax(gen max){
        System.out.println("Max = " +max);
    }

    public static void main(String[] args) {
        Integer xInt = 19, yInt = 34, zInt = 55;
        Float xF1 = 18.6f, yF1 = 5.8f, zF1 = 59.7f;
        String xStr="car" , yStr= "demo" , zStr = "hockey";

        MaximumGeneric.testMaximum(xInt, yInt, zInt);
        MaximumGeneric.testMaximum(xF1, yF1, zF1);
        MaximumGeneric.testMaximum(xStr, yStr, zStr);
    }

}