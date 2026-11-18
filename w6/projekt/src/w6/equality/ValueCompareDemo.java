package w6.equality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ValueCompareDemo {
    public static void main(String[] args) {
        Integer i1 = 127, i2 = 127;
        Integer j1 = 128, j2 = 128;
        System.out.println(i1 == i2);              // true: cached -128..127
        System.out.println(j1 == j2);              // false: two objects
        System.out.println(j1.equals(j2));         // true

        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3};
        System.out.println(x.equals(y));           // false: arrays use Object.equals
        System.out.println(Arrays.equals(x, y));   // true
        int[][] m1 = {{1, 2}};
        int[][] m2 = {{1, 2}};
        System.out.println(Arrays.equals(m1, m2) + " " + Arrays.deepEquals(m1, m2)); // false true

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = new LinkedList<>(List.of(1, 2, 3));
        System.out.println(list1.equals(list2));   // true: any List with equal elements
    }
}
