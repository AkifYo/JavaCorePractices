package P02_Primne_Number;

import java.util.Arrays;

public class A03_ZerogetsBack {
    public static void main(String[] args) {
        int [] input={3,0,4,6,5,2,0};
        int [] output= new int[input.length];
        int index=0;
        int count=0;
        int count1=1;

        while(input.length!=index){
        if (input[index]!=0){
            output[count]=input[index];
            count++;
        } else {
            output[input.length-count1]=input[index];
            count1++;
        }
        index++;
        }
        System.out.println(Arrays.toString(output));
    }
}
