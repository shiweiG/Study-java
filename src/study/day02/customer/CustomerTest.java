package study.day02.customer;
import java.util.Arrays;
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.eat();
        c1.SetName("yao");
        c1.getNation("中国");
        c1.sleep(5);
        int[]arr=new int[]{1,6,5,8,9,7,2};
        c1.sort(arr);

    }
}
