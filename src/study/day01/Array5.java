package study.day01;

public class Array5 {
    public static void main(String[] args) {
        String[]array05=new String[]{"哥哥","姐姐","弟弟","妹妹"};
        for (int i=0;i<array05.length;i++){
            System.out.print(array05[i]+" ");
        }
        System.out.println();
       /* //对array05的地址复制即赋值
        String[]array;
        array=array05;
        */
      /*//对数组array05的数组复制
         String[] array=new String[array05.length];
         for (int i=1;i<array05.length;i++){
             array[i]=array05[i];
         }
         */

         //数组反转
        for (int i=0;i<array05.length/2;i++){
            String temp=array05[i];
            array05[i]=array05[array05.length-i-1];
            array05[array05.length-i-1]=temp;
        }

        for (int i=0;i<array05.length;i++){
            System.out.printf(array05[i]+" ");
        }
        System.out.println();
        //线性查找
        String desc="姐姐";
        for (int i=0;i<array05.length;i++){
            if (desc==array05[i]){
                System.out.printf("位置为"+i);
                break;
            }
        }

    }
}
