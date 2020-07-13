public class PrimeNumberCalc {

    /**
     * Calculate total amount of prime number by the specific upper range value
     *
     * upper range value of prime num is 200000. this class has 2 methods to sum up prime number
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
     */
    public static long sumOfPrimeNum1(int urvNumber){
        if (urvNumber < 2) {
            System.out.println("invalid input.");
            return -1;
        }
        long sum = 0;
        for (int i = 2; i <= urvNumber; i++) {
            if (i % 2 == 0 && i != 2  ) {
                continue;
            }
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
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
     * Calculate sum of prime number by using Math.sqrt to reduce looping count
     *
     * @param urvNumber upper range value
     */
    public static long sumOfPrimeNum2(int urvNumber){
        if (urvNumber < 2) { //upper range value must be bigger than 1
            System.out.println("invalid input.");
            return -1;
        }
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

}
