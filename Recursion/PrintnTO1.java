public class PrintnTO1 {
    static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        print(i-1,n);
    }
    public static void main(String[] args) {
        int n=5;
        print(5,n);
    }
}
