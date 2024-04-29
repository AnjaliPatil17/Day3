package day3;

public class SecondLargestElementOfArray {
    public static void main(String[] args) {
        int number[]={34,73,56,8,44,2,6,3};
        int temp=0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
               if(number[i] > number[j]){
                     temp=number[i];
                     number[i]=number[j];
                     number[j]=temp;
               }
            }
            System.out.println("Second largest element of array is:  "+ number[number.length-2]);
        }
    }
}
