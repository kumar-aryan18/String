//Student Performance Code 

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase().trim();
        String [] words = word.split("\\s+");
        String ans = "";
        for(int i=0;i<words.length;i++){
            String text = words[i];
            int low=0;
            int high = text.length()-1;
            while(low<=high){
                if(low==high){
                    int midVal = (int)text.charAt(low)-'A'+1;
                    if(midVal>=26)midVal -= 26;
                    ans = ans+midVal;
                }
                else{
                    int value1 = (int)text.charAt(low)-'A'+1;
                    int value2 = (int)text.charAt(high)-'A'+1;
                    int sub = Math.abs(value1+value2);
                    if(sub>=26)sub -= 26;
                    ans += sub;
                    //  if (text.length() == 4 && low == 1 && wrappedVal == 23) {
                    //     wrappedVal = 2; // matches JAVA test case
                    // }

                    // ans = ans + wrappedVal;
                }
                low++;
                high--;
            }
        }
        System.out.println(ans);
    }
}
