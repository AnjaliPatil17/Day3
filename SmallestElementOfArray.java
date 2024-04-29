package day3;

public class SmallestElementOfArray {
    public static void main(String[] args) {
        int element[]={40,55,23,49,11,98,24};
        System.out.print("Smallest elemnt in array is: ");
        int min=element[0];
        for(int i=0;i<element.length;i++){
            if(min>element[i]){
                min=element[i];
            }
        }
        System.out.print(min);
    }
}
