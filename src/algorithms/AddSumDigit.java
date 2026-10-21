package algorithms;

public class AddSumDigit {
    public  static int addDigit(int number){
        do{
            int divisor = number / 10;
            int remainder = number % 10;
            number = divisor + remainder;
        }while(number < 9);
        return number;

    }

    public static void main(String[] args) {
        int number = 9;
        System.out.println(addDigit(number));
    }

}
