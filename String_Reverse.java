//Reverse string Example

import java.util.Scanner;

public class HELLO{
    public static void main(String[] args){
        int z =0 ;
        Scanner x = new Scanner(System.in);
        String y = x.nextLine();
        char[] char_arr = y.toCharArray();
        char[] reverse_char = new char[y.length()];
        for(int i = y.length() -1;i>=0;i--){
            
            reverse_char[z] = char_arr[i];
            z = z + 1;
           }
        String final_O = String.valueOf(reverse_char);
        System.out.println(final_O);
    }
}
