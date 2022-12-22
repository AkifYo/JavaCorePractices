package P03_String_Man;

public class C02_Elements_Swap {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c= 0; //c=3

        System.out.println("first Values a="+a+"  b ="+b+ " c="+c);
        c=a;
        a=b;// a= 5
        b=c;//b=3
        c=0;
        // now change the vales
        System.out.println("Last Values a="+a+"  b ="+b+"  c="+c);


    }
}
