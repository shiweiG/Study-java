package study.day01;
/**
 * 求数组元素得最大，最小，平均值
 * 所有随机数都是两位数
 * 公式：(int)(Math.random()*(99-10+1)+10)
 * */
public class Array03 {
    public static void main(String[] args) {
        int[] array03=new int[10];
        for (int i=0;i<array03.length;i++){
            array03[i]= (int) (Math.random()*(99-10+1)+10);
            System.out.print(array03[i]+"  ");
        }
        int Max=0;
        int Min=array03[0];
        //求平均数
        float sum=0;
        for (int i=0;i<array03.length;i++){
            sum=sum+array03[i];
        }

        //求最大值
        for (int i=0;i<array03.length;i++){
            if (Max<array03[i]){
                Max=array03[i];
            }
        }
        //求最小值
        for (int i=1;i<array03.length-1;i++){
            if (array03[0]<array03[i]){
                array03[0]=array03[1];
            }
        }

        int t=0;
        for (int i=0;i<array03.length;i++){
            for (int j=0;j<array03.length-1;j++){
                if (array03[i]<array03[j]){
                    t=array03[i];
                    array03[i]=array03[j];
                    array03[j]=t;
                }
            }
        }

        System.out.println();
        System.out.println(Max);
        System.out.println(sum/10);
        System.out.println(array03[0]);
        for (int i=0;i<array03.length;i++){
            System.out.print(array03[i]+" ");
        }
    }
}
