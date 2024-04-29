package day3;

public class ElementsOnEvenPosition {
    public static void main(String[] args) {
        int arr[]={23,5,33,67,34,90,77};
        System.out.print("Elemnts at even position are : ");
        //for(int i=0;i<arr.length;i=i+2)
        for(int i=0;i < arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
