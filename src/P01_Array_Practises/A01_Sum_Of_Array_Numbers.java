package P01_Array_Practises;

import java.util.Arrays;

public class A01_Sum_Of_Array_Numbers {
    public static void main(String[] args) {
        // we are gonna build an program that can sum all the numbers respectively
        // input={1,2,3,1,9,8,5,3,7,5}
        // output={1,2+3,1+9+8,5+3+7+5} = {1,5,18,20}
        int [] arr= {1,2,3,1,9,8,5,3,7};
        int[]arrNew= new int[4];
        int count=0;
        int findIndex=1;
        do {
            int total=0;
            for (int i = 0; i <=count ; i++) {
                total += arr[findIndex - 1 + 1];
            }
                arrNew[count]=total;
                count++;
                findIndex+=count;

        }while(count<arrNew.length);
        System.out.println(Arrays.toString(arrNew));
    }
}
