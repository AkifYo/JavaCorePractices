package P03_String_Man;

public class C03_Str {
    public static void main(String[] args) {
        String input="aaaabbbbbcccddd";
        String output="";
        int count=0;

        for (int i = 0; i < input.length(); i++) {
           count=0;
            for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(i)==input.charAt(j)){
                        count++;
                    }
            }
            if (!output.contains(input.substring(i,i+1))){
                output+=input.substring(i,i+1)+count;
            }
        }
        System.out.println("Output : "+output);
    }
}
