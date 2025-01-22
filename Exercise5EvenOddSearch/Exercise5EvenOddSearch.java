package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] splitInput = input.split(",");
        int[] numbers = new int[splitInput.length];
        int[] result = new int[4];
        result[0] = -1;
        result[1] = -1;
        result[2] = -1;
        result[3] = -1;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int pozpar = -1;
        int pozimpar = -1;
        for (int i = 0; i < splitInput.length; i++) {
            numbers[i] = Integer.parseInt(splitInput[i].trim());
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (max < numbers[i]) {
                    max = numbers[i];
                    pozpar = i;
                }
            } else if (numbers[i] % 2 != 0) {
                if (min > numbers[i]) {
                    min = numbers[i];
                    pozimpar = i;
                }
            }
        }
        if (pozpar != -1 && pozimpar != -1) {
            result[0] = max;
            result[1] = min;
            result[2] = pozpar;
            result[3] = pozimpar;
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }

    }
}
