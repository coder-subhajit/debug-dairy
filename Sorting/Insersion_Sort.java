public class Insersion_Sort {
    public static void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    } 
    public static void main(String[] args) {
        int[] arr={23,43,6,2,9};
        insertionSort(arr);
        System.out.print("Soretd:");
        for(int n : arr){
        System.out.print(n+" ");
        }
    }
}
