package study.day01;

public class Array01 {
    public static void main(String[] args) {
        int[][] arry01=new int[][]{{3,5,7},{12,9},{2,4,6}};
        int sum=0;
        for (int i=0;i<arry01.length;i++){
            for (int j=0;j<arry01[i].length;j++)
                sum=sum+arry01[i][j];
        }
        System.out.println(sum);
    }
}
