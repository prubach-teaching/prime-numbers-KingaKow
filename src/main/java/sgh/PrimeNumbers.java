package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        int num = 2;
        int p = 0;

        while(p< n) {
            if(isPrime(num)){
                System.out.print(num + ", ");
                p++;
            }
            num++;
        }
    }

    static boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        primes(6);

    }}