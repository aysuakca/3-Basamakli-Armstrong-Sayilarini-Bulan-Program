public class test {

    public static void main(String[] args) {

        for (int number = 100; number <= 999; number++) {
            int tempNumber = number;
            int basNumber = 3;
            int basValue;
            int basPow;
            int result = 0;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;

                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " sayisi bir Armstrong sayisidir.");
            }
        }
    }
}







