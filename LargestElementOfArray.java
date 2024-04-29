package day3;

public class LargestElementOfArray {
    public static void main(String[] args) {
        int number[]={23,45,10,100,67,89,33,9};
        System.out.print("Largest element in array: ");
        int max=number[0];
        for(int i=0;i<number.length;i++){
            if(max < number[i]){
                max=number[i];
            }
        } System.out.print(max);
    }
}
