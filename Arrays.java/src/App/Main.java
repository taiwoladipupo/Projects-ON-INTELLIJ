package App;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static Double[] toPower(int size, int power){
            Double[] result = new Double[size];

            for (int i = 0; i < size; i++){
                result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
            }

        return result;
    }

    public static void main(String[] args) {
        // write your code here

        double arr[] = {1, 4, 5, 7, 8};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array is " + sum);


        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }

        }

        System.out.println(index);



        Double[] result = toPower(4, 2);

        System.out.println("" + Arrays.toString(result));
    }
}
