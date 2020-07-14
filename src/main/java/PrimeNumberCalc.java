public class PrimeNumberCalc {

    /**
     * Calculate sum of prime number by the specific range
     *
     * upper range value of prime number is 200000. this class has 2 methods to sum prime number
     * @param args
     *
     */
    public static void main(String[] args) {
        //upper range value of prime number
        int urvOfPrimeNum = 200000;
        System.out.println(sumOfPrimeNum1(urvOfPrimeNum));
        System.out.println(sumOfPrimeNum2(urvOfPrimeNum));
    }

    /**
     * Calculate sum of prime number within the specific upper range value
     * @param urvNumber upper range value
     * @return if it's invalid , return 0, otherwise return sum of primer number within range
     *
     */
    public static long sumOfPrimeNum1(int urvNumber){
        long sum = 0;
        for (int i = 2; i <= urvNumber; i++) {
            if (i % 2 == 0 && i != 2  ) {
                continue;
            }
            boolean flag= true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Calculate sum of prime number for reducing looping count
     * @param urvNumber upper range value
     * @return if it's invalid , return 0, otherwise return sum of primer number within range
     *
     */
    public static long sumOfPrimeNum2(int urvNumber){
        long sum = 0;
        for (int i=2; i <= urvNumber; i++) {
            if (i % 2 == 0 && i != 2  ) {
                continue;
            }
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Check a number is a prime number or not
     * @param num number
     * @return true/false
     */
    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
