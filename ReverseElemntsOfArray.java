package day3;

public class ReverseElemntsOfArray {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Elements of an array in Reverse order: ");
        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
}
