package study.day01;

public class Array04 {
    public static void main(String[] args) {
        int[] array04 = new int[10];
        for (int i = 0; i < array04.length; i++) {
            array04[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.print(array04[i] + "  ");
        }
        int t=0;
        for (int i=0;i<array04.length-1;i++){
            for (int j=i+1;j<array04.length-1;j++){
                if (array04[i]>array04[j]){
                    t=array04[i];
                    array04[i]=array04[j];
                    array04[j]=t;
                }
            }
        }
        System.out.println();
        for (int i=0;i<array04.length;i++) {
            System.out.print(array04[i]+" ");
        }

    }
}
