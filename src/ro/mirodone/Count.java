package ro.mirodone;

import java.util.Arrays;

public class Count {

    public  int[] countPositivesSumNegatives(int[] input) {

        int [] result = new int[2];

        if(input ==null || input.length==0){
            return new int[0];
        }
        int count=0;

        for (int i = 0; i <input.length ; i++){

            if(input[i] >0 ){
                count++;
                result[0] =count;
            }if (input[i] < 0) {
                result[1] += input[i];
            }

        }

        return result; //return an array with count of positives and sum of negatives
    }


}
