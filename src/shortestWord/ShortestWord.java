package shortestWord;

import java.util.Arrays;

public class ShortestWord {
    public static String shortestWordInThesentence(String sentence) {
        String  cleanedSentence = sentence.replaceAll("[^a-zA-Z\\s]","");
        String[] words = cleanedSentence.split("\\s+");
        String shortest = words[0];
        for(String word : words){
            if(word.length()< shortest.length()){
                shortest = word;
            }
        }
        return shortest;

    }
    public static int[] getSquarearrayOfNumber(int[] numbers) {
        int[] array = new int[numbers.length];

        for(int count = 0; count < numbers.length; count++){
            for(int index = 0; index < numbers.length; index++){
                if(numbers[count] < numbers[index]){
                    int temp = numbers[count];
                    numbers[count] = numbers[index];
                    numbers[index] = temp;
                }
            }
        }
        for(int index = 0; index < numbers.length; index++){
            array[index] = numbers[index] * numbers[index];
        }
        return array;

    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,7};

        System.out.println(Arrays.toString(getSquarearrayOfNumber(numbers)));
    }

}
