package study.day01;

public class Array06 {
    public static void main(String[] args) {
        int[] array06=new int[]{1,2,3,4,5,6,7,8,9,10};
        int head=0;
        int dest=9;
        int end=array06.length-1;
        boolean isFlag=true;
        while(head<=end){
         int mid=(end+head)/2;
         if (dest==array06[mid]){
             System.out.println("找到位置了"+mid);
             isFlag=false;
             break;
         }else if (dest<array06[mid]){
               end=mid-1;
             }else if (dest>array06[mid]){
             head=mid+1;
         }
        }
        if (isFlag==true){
            System.out.println("没有找到");
        }
    }
    }




