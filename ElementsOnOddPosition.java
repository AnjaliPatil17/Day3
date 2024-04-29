package day3;

public class ElementsOnOddPosition {
    public static void main(String[] args) {
        int arr[]={33,54,67,87,56,23};
        System.out.print("Elements at odd position are: ");
        for(int i=0;i<arr.length;i++){
            if(i%2 !=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
