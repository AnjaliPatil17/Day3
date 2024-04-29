package day3;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,1,3,4,2,5,1};
        int list[]=new int[arr.length];
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=visited;
                }
            }
            if(list[i]!=visited){
                list[i]=count;
            }
            if(list[i]!=visited){
                System.out.println("has count"+list[i]+" times");
            }
        }
    }
}
