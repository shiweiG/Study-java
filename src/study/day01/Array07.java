package study.day01;
import java.util.Arrays;
/*
 *java.util.Arrays:操作数组的工具类，里面定义了很多数组的操作方法
 *
 */
public class Array07 {
    public static void main(String[] args) {
     /*
      *public static int binarySearch(Object[] a, Object key)用二分查找算法在给定数组中搜索给定值的对象(Byte,Int,double等)。
      * public static boolean equals(long[] a, long[] a2)比较数组：通过 equals 方法比较数组中元素值是否相等。
      * public static void fill(int[] a, int val)给数组赋值：通过 fill 方法。
      * public static void sort(Object[] a)对指定对象数组根据其元素的自然顺序进行升序排列
      */
     int[]array01=new int[]{1,2,3,8,5,9};
     int[]array02=new int[]{1,2,3,7,6,5};
     //判断数组是否相等
     boolean isFlag=Arrays.equals(array01,array02);
     System.out.println(isFlag);
     //遍历数组
     System.out.println(Arrays.toString(array01));
     //给数组中的元素赋值
     Arrays.fill(array01,10);
     System.out.println(Arrays.toString(array01));
     //排序sort为升序
     Arrays.sort(array02);
     System.out.println(Arrays.toString(array02));
     //二分查找
     int index=Arrays.binarySearch(array02,6);
     System.out.println(index);
    }
}
