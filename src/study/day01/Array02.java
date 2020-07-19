package study.day01;

public class Array02 {
    public static void main(String[] args) {
        int[][] array02=new int[10][];
        for (int i=0;i<array02.length;i++){
            array02[i]=new int[i+1];
            array02[i][0]=1;
            array02[i][i]=1;
            if(i>1){
                for (int j=1;j<array02[i].length-1;j++){
                    array02[i][j]=array02[i-1][j-1]+array02[i-1][j];
                }
            }
        }
        for (int i=0;i<array02.length;i++){
            for (int j=0;j<array02[i].length;j++){
                System.out.printf(array02[i][j]+" ");
            }
            System.out.println();
        }

    }
}
