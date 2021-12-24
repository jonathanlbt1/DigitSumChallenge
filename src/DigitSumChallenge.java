public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number >= 10){
            int sum = 0;
            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
