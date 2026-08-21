public class Reverse_Array {
    static void rev(int[] arr,int left,int right){
        //base case
        while(left>=right){
            return;
        }
        //swap
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        //recursive call
        rev(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rev(arr,0,arr.length-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
