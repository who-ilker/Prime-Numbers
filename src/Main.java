import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        //System.out.println(isPrime(40));

        prime1_100();

    }
    static boolean isPrime(int num){
        for (int i = 2; i < num; i++)
            if(num % i == 0)
                return false;
        return true;
    }
    static void prime1_100(){
        for (int i = 2; i <= 100; ++i){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

}