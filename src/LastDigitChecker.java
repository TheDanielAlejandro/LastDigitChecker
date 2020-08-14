public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ( (isValid(number1)) && (isValid(number2)) && (isValid(number3)) ) {
            int lastDigitn1 = number1 % 10;
            int lastDigitn2 = number2 % 10;
            int lastDigitn3 = number3 % 10;
            if (lastDigitn1 == lastDigitn2 || lastDigitn2 == lastDigitn3 || lastDigitn3 == lastDigitn1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    private static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}