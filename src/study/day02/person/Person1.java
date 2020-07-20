package study.day02.person;

public class Person1 {
    int age;
    String name;
    boolean isMale;
    public void study(){
        System.out.println("学习中");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int AddAge(int i){
        age=age+i;
        System.out.println(age);
        return age;
    }
}
