package primenumber;
public class PrimeNumber {
    public static void main(String[] args) {
     final int NumberOfPrimes = 50;
     final int NumberOfprimesPerLine = 10;
     int count = 0;
     int number = 2;
        System.out.println("the first 50 prime number are \n");
        while (count < NumberOfPrimes) {
            boolean isPrime = true;
            for (int divisor = 2 ; divisor <= number / 2 ; divisor++) {
                if (number % divisor == 0) {
                    isPrime =false;
                    break;
                }
            }
        if (isPrime) {
            count++;
            if (count % NumberOfprimesPerLine == 0) {
                System.out.println(number);
            }
            else 
                System.out.print(number +" ");
        }
        number++;
        }
    }
    
}
