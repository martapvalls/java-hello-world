package com.ironhack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        int[] numbers1 = {555, 42, 6663, 2, 1};

        multiplyNumbers(numbers);
        reverseArray(numbers);
        sortNumbers(numbers1);
    }

    public static void multiplyNumbers(int[] numbers){

        int firstNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(i == numbers.length-1){
                numbers[i] = numbers[i] * firstNumber;
            } else {
                numbers[i] = numbers[i] * (numbers[i+1]);
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverseArray(int[] numbers){
        int j = 0;
        int[] reversedNumbers = new int[5];
        for(int i = numbers.length-1; i >= 0; i--){
            reversedNumbers[j] = numbers[i];
            j++;
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }

    public static void sortNumbers(int[] numbers){
        Arrays.sort(numbers);
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}