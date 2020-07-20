package study.day02.customer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Customer {

    String name;
    int age;
    boolean isMale;
    public void eat(){
        System.out.println("陪客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("睡了"+hour+"小时");
    }
    public String getName(String name){
        return name;
    }
    public String SetName(String name){
        System.out.println(name);
        return name;
    }
    public String getNation(String nation){
        String info="我的国籍是"+nation;
        return nation;
    }
    public void sort(int[]arr){
        Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    }
}
