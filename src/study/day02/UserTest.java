package study.day02;

/**
 *
 * 类中属性的使用
 * 属性（成员变量）vs局部变量
 * 1.相同点：1.1定义变量格式一样
 *          1.2先声明，后使用
 *          1.3变量都有作用域
 *
 * 2.不同点：
 * 2.1属性：直接定义在类的一对{}内
 *  局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部变量
 *  2.2权限修饰符不同
 *  常见的权限修饰符：private、public、protected
 *  局部变量不可以使用权限修饰符
 *  2.3默认初始化值得问题
 *  属性：类的属性，根据其类型，都有默认初始化值
 *   整型（byte short int long）默认值0
 *   浮点型（float double）默认值0.0
 *   字符型（char）0
 *   布尔型（boolean）false
 *   引用数据类型（类 数组 接口）null
 */
public class UserTest {
    public static void main(String[] args) {
        User user=new User();
        user.age=1;
        user.eat();
        user.talk("中文");

    }
 static class User{
    //属性（或成员变量）
    String name;
    int age;
    boolean isMale;
    public void talk(String language){
        System.out.println("我们使用"+language+"进行交流");

    }
    public void eat(){
        String food="面条";
        System.out.println("我们吃"+food);
    }
}

}
