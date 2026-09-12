package algorithms;

import java.util.Arrays;

public class SquareNumbers {


        public static int[] solution(int[] numbers) {
            for(int number : numbers) {
                if(number < -100 || number > 1000) {
                    throw new IllegalArgumentException("number out of range");
                }
            }

            int[] squares = new int[numbers.length];
            for(int count = 0; count < numbers.length; count++) {
                squares[count] = numbers[count] * numbers[count];
            }

            for(int count = 0; count < squares.length; count++) {
                for(int counter = count + 1; counter < squares.length; counter++) {
                    if(squares[counter] < squares[count]) {
                        int temp = squares[count];
                        squares[count] = squares[counter];
                        squares[counter] = temp;
                    }
                }
            }
            return squares;


        }

        public static void main() {
            try {
                int[] numbers = {4, 5, 2, 6};
                System.out.println(Arrays.toString(solution(numbers)));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


}
