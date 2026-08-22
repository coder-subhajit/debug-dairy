public class Bubble_Sort{
     public static void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        boolean swapped;
        
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={34,12,9,52,6};
        bubbleSort(arr);
        System.out.print("Sorted:");
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}