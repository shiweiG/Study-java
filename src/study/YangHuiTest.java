package study;

public class YangHuiTest {
    public static void main(String[] args){
        //声明并初始化数组
        int [][] yanghui=new int [10][];
        //给二维数组赋值
        for (int i=0;i<yanghui.length;i++){
            yanghui[i]=new int[i+1];
            //给首末元素复制

            yanghui[i][0]=1;
            yanghui[i][i]=1;
        }
        for (int i=0;i<yanghui.length;i++){
            for (int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }


    }
}
