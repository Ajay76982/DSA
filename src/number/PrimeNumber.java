package src.number;

public class PrimeNumber {

    public static void main(String[] args){

        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrime(21));

        System.out.println(primeNumber.isPrimeWithOptimise(21));
    }

    public Boolean isPrime(int number){
        boolean isPrime = true;
        if(number == 0 || number == 1){
            return false;
        }
        int i = 2;
        int n = number;
        while(i != number ){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }

    public Boolean isPrimeWithOptimise(int number){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
