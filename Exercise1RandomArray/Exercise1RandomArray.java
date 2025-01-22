package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n]; //creeaza spatiu cu n elemente aloca 
        //TODO: implement the logic to fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i <n; i++) {
            array[i] = rand.nextInt(); 
        }
        return array;
    }

    public static int[] findMinAndMax(int[] array) {
       int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] result = {min, max};
        return result;
    }
         //   return null;
        
    
    public static void print() {
        System.out.println("TEST");
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:" + mm[0] + " Max is:" + mm[1]);
    }
}
