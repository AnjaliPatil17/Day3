package day3;

public class DuplicateElementsOfAnArray {
    public static void main(String[] args) {
        int arr[]={2,4,3,2,5,3,6,4,7,5};
        System.out.print("Duplicates elements in array are: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
