import java.util.Arrays;

public class MaximumGeneric<gen extends Comparable<gen>> {
    gen a,b,c;

    public MaximumGeneric(gen a, gen b, gen c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MaximumGeneric() {}

    public void addElements(gen... array) {
        Arrays.sort(array);

        for (int i = array.length - 1; i < array.length; i++) {
            System.out.println("Maximum value = " +array[i]);
        }
    }
    public static void main(String[] args) {

        MaximumGeneric object = new MaximumGeneric();
        object.addElements(1, 4, 7, 32, 8, 5);   //Integer
        object.addElements(1.1f, 5.6f, 7.9f, 5.0f, 24.8f);    // Float
        object.addElements("java", "demo", "engineer", "software", "itsector"); //String
    }
}