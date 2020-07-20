package study.day02;

/**
 * 1.设计类，就是设计类的成员
 * 属性=成员变量=field=域、字段
 * 方法=成员方法=函数=method
 * 创建对象=类的实例化
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="tom";
        person.isMale=true;
        System.out.println(person.name);
        person.eat();
        person.talk("中文");


    }
}
class Person{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话,使用的语言是"+language);
    }

}
