package P01_Array_Practises;

public class A05_Best_twin {
    public static void main(String[] args) {
        int [] arr ={3,45,96,78,56,43};

        int num1=0;
        int count= arr[1]-arr[0];
        int num2=0;
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                int count1= arr[i]-arr[j];
                if (count1<0){
                    count1*=-1;
                }
                if (count1<count){
                    count =count1;
                    num1=arr[i];
                    num2=arr[j];
                }
            }
        }
        System.out.println("Expected number are : "+num1+" "+num2);
    }
}
