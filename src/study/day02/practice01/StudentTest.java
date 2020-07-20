package study.day02.practice01;

import java.security.PublicKey;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu=new Student[20];
        for (int i=0;i<20;i++){
            //创建20个数组对象
            stu[i]=new Student();
            //给每个数组对象赋值
            stu[i].number=i+1;
            //随机生成六个年级给state[1.6]
            stu[i].state=(int)(Math.random()*(6-1+1)+1);
            //成绩[0,100]
            stu[i].score=(int)(Math.random()*(100-0+1)+0);
        }
        StudentTest test=new StudentTest();
        test.print(stu);
        System.out.println("************");
        test.searchState(stu,3);
        System.out.println("************");
        test.sort(stu);
        test.print1(stu);


        /**for (int i=0;i<stu.length;i++){
            System.out.println(stu[i].info());
        }
        System.out.println("***********");
        //打印出state=3的学生信息
        for (int i=0;i<stu.length;i++){
            if (stu[i].state==3){
               System.out.println(stu[i].info());
            }
        }
        System.out.println("*************");
        //按照学生成绩排序
        for (int i=0;i<stu.length;i++){
            for (int j=0;j<stu.length-i-1;j++){
                if(stu[j].score>stu[j+1].score){
                   Student temp=stu[j];
                   stu[j]=stu[j+1];
                   stu[j+1]=temp;
                }
            }
        }
        for (int i=0;i<stu.length;i++){
            System.out.println(stu[i].info());
        }
         */


    }

    /**
     * 遍历
     * @param stu
     */
    public void print(Student[] stu){
        for (int i = 0; i<stu.length; i++){
            System.out.println(stu[i].info());
        }
    }

    /**
     * 查找
     * @param stu
     * @param state
     */
    public void searchState(Student[] stu,int state){
        for (int i=0;i<stu.length;i++){
            if (stu[i].state==state){
                System.out.println(stu[i].info());
            }
        }
    }

    /**
     * 排序
     * @param stu
     */
    public void sort(Student[] stu){
        for (int i=0;i<stu.length;i++){
            for (int j=0;j<stu.length-i-1;j++){
                if(stu[j].score>stu[j+1].score){
                    Student temp=stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=temp;
                }
            }
        }

    }

    /**
     * 遍历
     * @param stu
     */
    public void print1(Student[] stu){
        for (int i = 0; i<stu.length; i++){
            System.out.println(stu[i].info());
        }
    }


}
