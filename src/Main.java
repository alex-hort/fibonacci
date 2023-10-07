public class Main {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            System.out.print(" "+ fibonacci(i));
        }
    }
    static long fibonacci(long n){
        if(n<=1){
            return n;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}