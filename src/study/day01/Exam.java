package study.day01;

public class Exam {
    public static void main(String[] args) {
        int[]array=new int[]{34,5,22,-98,6,-76,0,-3};
        //1.反转数组
      /*  for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }


*/
      //2.复制上述数组
      int[]array2=new int[array.length] ;
      for (int i=0;i<array.length;i++){
          array2[i]=array[i];
      }
      for (int i=0;i<array2.length;i++){
          System.out.print(array2[i]+" ");
      }
      //线性查找
        System.out.println();
        int dest=22;
        boolean isFlag=true;
      for (int i=0;i<array.length;i++){
          if (dest==array[i]){
              System.out.print("找到数据位置 "+i);
              isFlag=false;
              break;
          }
      }
      System.out.println();
      if (isFlag==true){
          System.out.println("不存在");
      }

    }
}
